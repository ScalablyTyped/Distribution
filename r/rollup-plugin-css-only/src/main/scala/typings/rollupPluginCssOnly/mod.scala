package typings.rollupPluginCssOnly

import typings.rollup.mod.OutputBundle
import typings.rollup.mod.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-css-only", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      *  CSS files to exclude from being parsed
      */
    var exclude: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
    
    /**
      *  All CSS files will be parsed by default, but you can also specifically include files
      */
    var include: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
    
    /**
      * Callback that will be called ongenerate
      */
    var output: js.UndefOr[
        Boolean | String | (js.Function3[
          /* styles */ String, 
          /* styleNodes */ Record[String, String], 
          /* bundle */ OutputBundle, 
          Unit
        ]) | Null
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: (js.Array[String | js.RegExp]) | String | js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: (js.Array[String | js.RegExp]) | String | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeNull: Self = StObject.set(x, "include", null)
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setOutput(
        value: Boolean | String | (js.Function3[
              /* styles */ String, 
              /* styleNodes */ Record[String, String], 
              /* bundle */ OutputBundle, 
              Unit
            ])
      ): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFunction3(
        value: (/* styles */ String, /* styleNodes */ Record[String, String], /* bundle */ OutputBundle) => Unit
      ): Self = StObject.set(x, "output", js.Any.fromFunction3(value))
      
      inline def setOutputNull: Self = StObject.set(x, "output", null)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
