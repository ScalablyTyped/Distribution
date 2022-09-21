package typings.rollupPluginAutoExternal

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: AutoExternalOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-auto-external", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AutoExternalOptions extends StObject {
    
    /**
      * defaults to true. Add all Node.js builtin modules (in the running version) as externals. Specify a string value (e.g., '6.0.0') to add all builtin modules for a specific version of Node.js.
      * Rollup will complain if builtins is present, and the build target is a browser. You may want [rollup-plugin-node-builtins](https://npm.im/package/rollup-plugin-node-builtins).
      */
    var builtins: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * defaults to true.
      */
    var dependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * defaults to process.cwd(). Path to a package.json file or its directory.
      */
    var packagePath: js.UndefOr[String] = js.undefined
    
    /**
      * defaults to true.
      */
    var peerDependencies: js.UndefOr[Boolean] = js.undefined
  }
  object AutoExternalOptions {
    
    inline def apply(): AutoExternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoExternalOptions]
    }
    
    extension [Self <: AutoExternalOptions](x: Self) {
      
      inline def setBuiltins(value: Boolean | String): Self = StObject.set(x, "builtins", value.asInstanceOf[js.Any])
      
      inline def setBuiltinsUndefined: Self = StObject.set(x, "builtins", js.undefined)
      
      inline def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
      
      inline def setPeerDependencies(value: Boolean): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
    }
  }
}
