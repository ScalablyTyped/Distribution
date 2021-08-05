package typings.rollupPluginNodeResolve

import typings.resolve.mod.AsyncOpts
import typings.rollup.mod.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-node-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait Options extends StObject {
    
    /**
    	 * some package.json files have a "browser" field which specifies
    	 * alternative files to load for people bundling for the browser. If
    	 * that's you, either use this option or add "browser" to the
    	 * "mainfields" option, otherwise pkg.browser will be ignored
    	 * @default false
    	 */
    var browser: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Any additional options that should be passed through
    	 * to node-resolve
    	 */
    var customResolveOptions: js.UndefOr[AsyncOpts] = js.undefined
    
    /**
    	 * Force resolving for these modules to root's node_modules that helps
    	 * to prevent bundling the same package multiple times if package is
    	 * imported from dependencies.
    	 */
    var dedupe: js.UndefOr[js.Array[String] | (js.Function1[/* importee */ String, Boolean])] = js.undefined
    
    /**
    	 * not all files you want to resolve are .js files
    	 * @default [ '.mjs', '.js', '.json', '.node' ]
    	 */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	 * Lock the module search in this path (like a chroot). Module defined
    	 * outside this path will be marked as external
    	 * @default '/'
    	 */
    var jail: js.UndefOr[String] = js.undefined
    
    /**
    	 * @deprecated use "mainFields" instead
    	 * use "jsnext:main" if possible
    	 * legacy field pointing to ES6 module in third-party libraries,
    	 * deprecated in favor of "pkg.module":
    	 * - see: https://github.com/rollup/rollup/wiki/pkg.module
    	 * @default false
    	 */
    var jsnext: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * @deprecated use "mainFields" instead
    	 * use "main" field or index.js, even if it's not an ES6 module
    	 * (needs to be converted from CommonJS to ES6)
    	 * – see https://github.com/rollup/rollup-plugin-commonjs
    	 * @default true
    	 */
    var main: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * the fields to scan in a package.json to determine the entry point
    	 * if this list contains "browser", overrides specified in "pkg.browser"
    	 * will be used
    	 * @default ['module', 'main']
    	 */
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	 * @deprecated use "mainFields" instead
    	 * use "module" field for ES6 module if possible
    	 * @default true
    	 */
    var module: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * If true, inspect resolved files to check that they are
    	 * ES2015 modules
    	 * @default false
    	 */
    var modulesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Set to an array of strings and/or regexps to lock the module search
    	 * to modules that match at least one entry. Modules not matching any
    	 * entry will be marked as external
    	 * @default null
    	 */
    var only: js.UndefOr[(js.Array[String | RegExp]) | Null] = js.undefined
    
    /**
    	 * whether to prefer built-in modules (e.g. `fs`, `path`) or
    	 * local ones with the same names
    	 * @default true
    	 */
    var preferBuiltins: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setCustomResolveOptions(value: AsyncOpts): Self = StObject.set(x, "customResolveOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomResolveOptionsUndefined: Self = StObject.set(x, "customResolveOptions", js.undefined)
      
      inline def setDedupe(value: js.Array[String] | (js.Function1[/* importee */ String, Boolean])): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeFunction1(value: /* importee */ String => Boolean): Self = StObject.set(x, "dedupe", js.Any.fromFunction1(value))
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
      
      inline def setDedupeVarargs(value: String*): Self = StObject.set(x, "dedupe", js.Array(value :_*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setJail(value: String): Self = StObject.set(x, "jail", value.asInstanceOf[js.Any])
      
      inline def setJailUndefined: Self = StObject.set(x, "jail", js.undefined)
      
      inline def setJsnext(value: Boolean): Self = StObject.set(x, "jsnext", value.asInstanceOf[js.Any])
      
      inline def setJsnextUndefined: Self = StObject.set(x, "jsnext", js.undefined)
      
      inline def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setModulesOnlyUndefined: Self = StObject.set(x, "modulesOnly", js.undefined)
      
      inline def setOnly(value: js.Array[String | RegExp]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyNull: Self = StObject.set(x, "only", null)
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: (String | RegExp)*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      inline def setPreferBuiltins(value: Boolean): Self = StObject.set(x, "preferBuiltins", value.asInstanceOf[js.Any])
      
      inline def setPreferBuiltinsUndefined: Self = StObject.set(x, "preferBuiltins", js.undefined)
    }
  }
}
