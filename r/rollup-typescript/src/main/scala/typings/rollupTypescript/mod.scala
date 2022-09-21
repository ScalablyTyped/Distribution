package typings.rollupTypescript

import typings.rollupTypescript.anon.Code
import typings.rollupTypescript.anon.Typeofts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): RollupPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RollupPlugin]
  inline def default(options: Options): RollupPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[RollupPlugin]
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var tsconfig: js.UndefOr[Boolean] = js.undefined
    
    var typescript: js.UndefOr[Typeofts] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setTsconfig(value: Boolean): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
      
      inline def setTypescript(value: Typeofts): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
  
  trait RollupPlugin extends StObject {
    
    def load(id: String): String
    
    def resolveId(importee: String, importer: String): Any
    
    def transform(code: String, id: String): Code
  }
  object RollupPlugin {
    
    inline def apply(load: String => String, resolveId: (String, String) => Any, transform: (String, String) => Code): RollupPlugin = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), resolveId = js.Any.fromFunction2(resolveId), transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[RollupPlugin]
    }
    
    extension [Self <: RollupPlugin](x: Self) {
      
      inline def setLoad(value: String => String): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setResolveId(value: (String, String) => Any): Self = StObject.set(x, "resolveId", js.Any.fromFunction2(value))
      
      inline def setTransform(value: (String, String) => Code): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
