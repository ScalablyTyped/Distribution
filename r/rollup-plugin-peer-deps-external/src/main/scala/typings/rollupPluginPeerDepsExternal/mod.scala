package typings.rollupPluginPeerDepsExternal

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: PluginPeerDepsExternalOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-peer-deps-external", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PluginPeerDepsExternalOptions extends StObject {
    
    var includeDependencies: js.UndefOr[Boolean] = js.undefined
    
    var packageJsonPath: js.UndefOr[String] = js.undefined
  }
  object PluginPeerDepsExternalOptions {
    
    inline def apply(): PluginPeerDepsExternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginPeerDepsExternalOptions]
    }
    
    extension [Self <: PluginPeerDepsExternalOptions](x: Self) {
      
      inline def setIncludeDependencies(value: Boolean): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
      
      inline def setIncludeDependenciesUndefined: Self = StObject.set(x, "includeDependencies", js.undefined)
      
      inline def setPackageJsonPath(value: String): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonPathUndefined: Self = StObject.set(x, "packageJsonPath", js.undefined)
    }
  }
}
