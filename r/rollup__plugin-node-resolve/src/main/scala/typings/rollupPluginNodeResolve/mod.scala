package typings.rollupPluginNodeResolve

import typings.rollup.mod.Plugin
import typings.rollupPluginNodeResolve.rollupPluginNodeResolveStrings.Dotjs
import typings.rollupPluginNodeResolve.rollupPluginNodeResolveStrings.Dotjson
import typings.rollupPluginNodeResolve.rollupPluginNodeResolveStrings.Dotmjs
import typings.rollupPluginNodeResolve.rollupPluginNodeResolveStrings.Dotnode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/plugin-node-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupNodeResolveOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  object DEFAULTS {
    
    @JSImport("@rollup/plugin-node-resolve", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rollup/plugin-node-resolve", "DEFAULTS.dedupe")
    @js.native
    def dedupe: js.Array[Any] = js.native
    inline def dedupe_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/plugin-node-resolve", "DEFAULTS.extensions")
    @js.native
    def extensions: js.Tuple4[Dotmjs, Dotjs, Dotjson, Dotnode] = js.native
    inline def extensions_=(x: js.Tuple4[Dotmjs, Dotjs, Dotjson, Dotnode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("@rollup/plugin-node-resolve", "DEFAULTS.resolveOnly")
    @js.native
    def resolveOnly: js.Array[Any] = js.native
    inline def resolveOnly_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolveOnly")(x.asInstanceOf[js.Any])
  }
  
  inline def nodeResolve(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeResolve")().asInstanceOf[Plugin]
  inline def nodeResolve(options: RollupNodeResolveOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeResolve")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait RollupNodeResolveOptions extends StObject {
    
    /**
      * If `true`, instructs the plugin to use the `"browser"` property in `package.json`
      * files to specify alternative files to load for bundling. This is useful when
      * bundling for a browser environment. Alternatively, a value of `'browser'` can be
      * added to the `mainFields` option. If `false`, any `"browser"` properties in
      * package files will be ignored. This option takes precedence over `mainFields`.
      * @default false
      */
    var browser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An `Array` of modules names, which instructs the plugin to force resolving for the
      * specified modules to the root `node_modules`. Helps to prevent bundling the same
      * package multiple times if package is imported from dependencies.
      */
    var dedupe: js.UndefOr[js.Array[String] | (js.Function1[/* importee */ String, Boolean])] = js.undefined
    
    /**
      * Additional conditions of the package.json exports field to match when resolving modules.
      * By default, this plugin looks for the `'default', 'module', 'import']` conditions when resolving imports.
      *
      * When using `@rollup/plugin-commonjs` v16 or higher, this plugin will use the
      * `['default', 'module', 'import']` conditions when resolving require statements.
      *
      * Setting this option will add extra conditions on top of the default conditions.
      * See https://nodejs.org/api/packages.html#packages_conditional_exports for more information.
      */
    var exportConditions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specifies the extensions of files that the plugin will operate on.
      * @default [ '.mjs', '.js', '.json', '.node' ]
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Locks the module search within specified path (e.g. chroot). Modules defined
      * outside this path will be marked as external.
      * @default '/'
      */
    var jail: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the properties to scan within a `package.json`, used to determine the
      * bundle entry point.
      * @default ['module', 'main']
      */
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of directory names in which to recursively look for modules.
      * @default ['node_modules']
      */
    var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of absolute paths to additional locations to search for modules.
      * This is analogous to setting the `NODE_PATH` environment variable for node.
      * @default []
      */
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If `true`, inspect resolved files to assert that they are ES2015 modules.
      * @default false
      */
    var modulesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the plugin will prefer built-in modules (e.g. `fs`, `path`). If `false`,
      * the plugin will look for locally installed modules of the same name.
      * @default true
      */
    var preferBuiltins: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An `Array` which instructs the plugin to limit module resolution to those whose
      * names match patterns in the array.
      * @default []
      */
    var resolveOnly: js.UndefOr[
        (js.Array[String | js.RegExp]) | Null | (js.Function1[/* module */ String, Boolean])
      ] = js.undefined
    
    /**
      * Specifies the root directory from which to resolve modules. Typically used when
      * resolving entry-point imports, and when resolving deduplicated modules.
      * @default process.cwd()
      */
    var rootDir: js.UndefOr[String] = js.undefined
  }
  object RollupNodeResolveOptions {
    
    inline def apply(): RollupNodeResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupNodeResolveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RollupNodeResolveOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setDedupe(value: js.Array[String] | (js.Function1[/* importee */ String, Boolean])): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
      
      inline def setDedupeFunction1(value: /* importee */ String => Boolean): Self = StObject.set(x, "dedupe", js.Any.fromFunction1(value))
      
      inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
      
      inline def setDedupeVarargs(value: String*): Self = StObject.set(x, "dedupe", js.Array(value*))
      
      inline def setExportConditions(value: js.Array[String]): Self = StObject.set(x, "exportConditions", value.asInstanceOf[js.Any])
      
      inline def setExportConditionsUndefined: Self = StObject.set(x, "exportConditions", js.undefined)
      
      inline def setExportConditionsVarargs(value: String*): Self = StObject.set(x, "exportConditions", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setJail(value: String): Self = StObject.set(x, "jail", value.asInstanceOf[js.Any])
      
      inline def setJailUndefined: Self = StObject.set(x, "jail", js.undefined)
      
      inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
      
      inline def setModuleDirectoriesUndefined: Self = StObject.set(x, "moduleDirectories", js.undefined)
      
      inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
      
      inline def setModulePaths(value: js.Array[String]): Self = StObject.set(x, "modulePaths", value.asInstanceOf[js.Any])
      
      inline def setModulePathsUndefined: Self = StObject.set(x, "modulePaths", js.undefined)
      
      inline def setModulePathsVarargs(value: String*): Self = StObject.set(x, "modulePaths", js.Array(value*))
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setModulesOnlyUndefined: Self = StObject.set(x, "modulesOnly", js.undefined)
      
      inline def setPreferBuiltins(value: Boolean): Self = StObject.set(x, "preferBuiltins", value.asInstanceOf[js.Any])
      
      inline def setPreferBuiltinsUndefined: Self = StObject.set(x, "preferBuiltins", js.undefined)
      
      inline def setResolveOnly(value: (js.Array[String | js.RegExp]) | (js.Function1[/* module */ String, Boolean])): Self = StObject.set(x, "resolveOnly", value.asInstanceOf[js.Any])
      
      inline def setResolveOnlyFunction1(value: /* module */ String => Boolean): Self = StObject.set(x, "resolveOnly", js.Any.fromFunction1(value))
      
      inline def setResolveOnlyNull: Self = StObject.set(x, "resolveOnly", null)
      
      inline def setResolveOnlyUndefined: Self = StObject.set(x, "resolveOnly", js.undefined)
      
      inline def setResolveOnlyVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "resolveOnly", js.Array(value*))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
    }
  }
}
