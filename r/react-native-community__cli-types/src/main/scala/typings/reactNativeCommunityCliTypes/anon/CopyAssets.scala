package typings.reactNativeCommunityCliTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyAssets[ProjectConfig, DependencyConfig] extends StObject {
  
  def copyAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  
  def isInstalled(projectConfig: ProjectConfig, packageName: String, dependencyConfig: DependencyConfig): Boolean = js.native
  
  def register(name: String, dependencyConfig: DependencyConfig, params: js.Object, projectConfig: ProjectConfig): Unit = js.native
  
  def unlinkAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  
  def unregister(
    name: String,
    dependencyConfig: DependencyConfig,
    projectConfig: ProjectConfig,
    otherDependencies: js.Array[DependencyConfig]
  ): Unit = js.native
}
object CopyAssets {
  
  @scala.inline
  def apply[ProjectConfig, DependencyConfig](
    copyAssets: (js.Array[String], ProjectConfig) => Unit,
    isInstalled: (ProjectConfig, String, DependencyConfig) => Boolean,
    register: (String, DependencyConfig, js.Object, ProjectConfig) => Unit,
    unlinkAssets: (js.Array[String], ProjectConfig) => Unit,
    unregister: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit
  ): CopyAssets[ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal(copyAssets = js.Any.fromFunction2(copyAssets), isInstalled = js.Any.fromFunction3(isInstalled), register = js.Any.fromFunction4(register), unlinkAssets = js.Any.fromFunction2(unlinkAssets), unregister = js.Any.fromFunction4(unregister))
    __obj.asInstanceOf[CopyAssets[ProjectConfig, DependencyConfig]]
  }
  
  @scala.inline
  implicit class CopyAssetsMutableBuilder[Self <: CopyAssets[_, _], ProjectConfig, DependencyConfig] (val x: Self with (CopyAssets[ProjectConfig, DependencyConfig])) extends AnyVal {
    
    @scala.inline
    def setCopyAssets(value: (js.Array[String], ProjectConfig) => Unit): Self = StObject.set(x, "copyAssets", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsInstalled(value: (ProjectConfig, String, DependencyConfig) => Boolean): Self = StObject.set(x, "isInstalled", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegister(value: (String, DependencyConfig, js.Object, ProjectConfig) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnlinkAssets(value: (js.Array[String], ProjectConfig) => Unit): Self = StObject.set(x, "unlinkAssets", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister(value: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction4(value))
  }
}
