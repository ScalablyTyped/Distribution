package typings.rollupPluginCommonjs

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-commonjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupCommonJSOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait RollupCommonJSOptions extends StObject {
    
    /**
    	 * non-CommonJS modules will be ignored, but you can also
    	 * specifically include/exclude files
    	 * @default undefined
    	 */
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
    	 * search for files other than .js files (must already
    	 * be transpiled by a previous plugin!)
    	 * @default [ '.js' ]
    	 */
    var extensions: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	 * sometimes you have to leave require statements
    	 * unconverted. Pass an array containing the IDs
    	 * or a `id => boolean` function. Only use this
    	 * option if you know what you're doing!
    	 */
    var ignore: js.UndefOr[js.Array[String | (js.Function1[/* id */ String, Boolean])]] = js.undefined
    
    /**
    	 * if true then uses of `global` won't be dealt with by this plugin
    	 * @default false
    	 */
    var ignoreGlobal: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * non-CommonJS modules will be ignored, but you can also
    	 * specifically include/exclude files
    	 * @default undefined
    	 */
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
    	 * explicitly specify unresolvable named exports
    	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
    	 * @default undefined
    	 */
    var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    /**
    	 * if false then skip sourceMap generation for CommonJS modules
    	 * @default true
    	 */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object RollupCommonJSOptions {
    
    inline def apply(): RollupCommonJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupCommonJSOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RollupCommonJSOptions] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String | (js.Function1[/* id */ String, Boolean])]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGlobal(value: Boolean): Self = StObject.set(x, "ignoreGlobal", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGlobalUndefined: Self = StObject.set(x, "ignoreGlobal", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | (js.Function1[/* id */ String, Boolean]))*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setNamedExports(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
}
