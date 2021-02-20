package typings.rollupPluginPeerDepsExternal

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-peer-deps-external", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("rollup-plugin-peer-deps-external", JSImport.Namespace)
  @js.native
  def apply(options: PluginPeerDepsExternalOptions): Plugin = js.native
  
  @js.native
  trait PluginPeerDepsExternalOptions extends StObject {
    
    var includeDependencies: js.UndefOr[Boolean] = js.native
    
    var packageJsonPath: js.UndefOr[String] = js.native
  }
  object PluginPeerDepsExternalOptions {
    
    @scala.inline
    def apply(): PluginPeerDepsExternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginPeerDepsExternalOptions]
    }
    
    @scala.inline
    implicit class PluginPeerDepsExternalOptionsMutableBuilder[Self <: PluginPeerDepsExternalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDependencies(value: Boolean): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDependenciesUndefined: Self = StObject.set(x, "includeDependencies", js.undefined)
      
      @scala.inline
      def setPackageJsonPath(value: String): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageJsonPathUndefined: Self = StObject.set(x, "packageJsonPath", js.undefined)
    }
  }
}
