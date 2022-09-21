package typings.stringifyEntities

import typings.stringifyEntities.formatSmartMod.FormatSmartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("stringify-entities/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def core(value: String, options: CoreWithFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("core")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CoreOptions extends StObject {
    
    /**
      * Whether to only escape possibly dangerous characters.
      * Those characters are `"`, `&`, `'`, `<`, `>`, and `` ` ``.
      */
    var escapeOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to only escape the given subset of characters.
      */
    var subset: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CoreOptions {
    
    inline def apply(): CoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreOptions]
    }
    
    extension [Self <: CoreOptions](x: Self) {
      
      inline def setEscapeOnly(value: Boolean): Self = StObject.set(x, "escapeOnly", value.asInstanceOf[js.Any])
      
      inline def setEscapeOnlyUndefined: Self = StObject.set(x, "escapeOnly", js.undefined)
      
      inline def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
      
      inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
      
      inline def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value*))
    }
  }
  
  trait CoreWithFormatOptions
    extends StObject
       with CoreOptions
       with FormatOptions
       with FormatSmartOptions
  object CoreWithFormatOptions {
    
    inline def apply(format: (Double, Double, CoreWithFormatOptions) => String): CoreWithFormatOptions = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format))
      __obj.asInstanceOf[CoreWithFormatOptions]
    }
  }
  
  trait FormatOptions extends StObject {
    
    /**
      *  Format strategy.
      */
    def format(code: Double, next: Double, options: CoreWithFormatOptions): String
  }
  object FormatOptions {
    
    inline def apply(format: (Double, Double, CoreWithFormatOptions) => String): FormatOptions = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format))
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setFormat(value: (Double, Double, CoreWithFormatOptions) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    }
  }
}
