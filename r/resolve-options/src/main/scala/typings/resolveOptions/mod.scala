package typings.resolveOptions

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: Config, options: Options): Resolver = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Resolver]
  
  @JSImport("resolve-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Config = StringDictionary[ConfigItem]
  
  trait ConfigItem extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var `type`: String | js.Array[String]
  }
  object ConfigItem {
    
    inline def apply(`type`: String | js.Array[String]): ConfigItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigItem]
    }
    
    extension [Self <: ConfigItem](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var base: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
    
    var buffer: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var cwd: js.UndefOr[String | (js.Function1[/* repeated */ Any, String])] = js.undefined
    
    var deep: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var dirMode: js.UndefOr[String | Double | (js.Function1[/* repeated */ Any, String | Double])] = js.undefined
    
    var mode: js.UndefOr[String | Double | (js.Function1[/* repeated */ Any, String | Double])] = js.undefined
    
    var overwrite: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var passthrough: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var read: js.UndefOr[Boolean | (js.Function1[/* repeated */ Any, Boolean])] = js.undefined
    
    var since: js.UndefOr[js.Date | Double | (js.Function1[/* repeated */ Any, js.Date | Double])] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowEmpty(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "allowEmpty", js.Any.fromFunction1(value))
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setBase(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "base", js.Any.fromFunction1(value))
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBuffer(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "buffer", js.Any.fromFunction1(value))
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCwd(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "cwd", js.Any.fromFunction1(value))
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDeep(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDirMode(value: String | Double | (js.Function1[/* repeated */ Any, String | Double])): Self = StObject.set(x, "dirMode", value.asInstanceOf[js.Any])
      
      inline def setDirModeFunction1(value: /* repeated */ Any => String | Double): Self = StObject.set(x, "dirMode", js.Any.fromFunction1(value))
      
      inline def setDirModeUndefined: Self = StObject.set(x, "dirMode", js.undefined)
      
      inline def setMode(value: String | Double | (js.Function1[/* repeated */ Any, String | Double])): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeFunction1(value: /* repeated */ Any => String | Double): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOverwrite(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "overwrite", js.Any.fromFunction1(value))
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPassthrough(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "passthrough", js.Any.fromFunction1(value))
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setRead(value: Boolean | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setSince(value: js.Date | Double | (js.Function1[/* repeated */ Any, js.Date | Double])): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceFunction1(value: /* repeated */ Any => js.Date | Double): Self = StObject.set(x, "since", js.Any.fromFunction1(value))
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    }
  }
  
  trait Resolver extends StObject {
    
    def resolve(key: String): js.UndefOr[Double | String | Boolean | js.Date | Null]
  }
  object Resolver {
    
    inline def apply(resolve: String => js.UndefOr[Double | String | Boolean | js.Date | Null]): Resolver = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Resolver]
    }
    
    extension [Self <: Resolver](x: Self) {
      
      inline def setResolve(value: String => js.UndefOr[Double | String | Boolean | js.Date | Null]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
