package typings.reactNativeCommunityCli.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyAssets[ProjectConfig, DependencyConfig] extends js.Object {
  def copyAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  def isInstalled(projectConfig: ProjectConfig, name: String, dependencyConfig: DependencyConfig): Boolean = js.native
  def register(
    name: String,
    dependencyConfig: DependencyConfig,
    params: Record[String, String],
    projectConfig: ProjectConfig
  ): Unit = js.native
  def unlinkAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit = js.native
  def unregister(
    packageName: String,
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
    register: (String, DependencyConfig, Record[String, String], ProjectConfig) => Unit,
    unlinkAssets: (js.Array[String], ProjectConfig) => Unit,
    unregister: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit
  ): CopyAssets[ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal(copyAssets = js.Any.fromFunction2(copyAssets), isInstalled = js.Any.fromFunction3(isInstalled), register = js.Any.fromFunction4(register), unlinkAssets = js.Any.fromFunction2(unlinkAssets), unregister = js.Any.fromFunction4(unregister))
    __obj.asInstanceOf[CopyAssets[ProjectConfig, DependencyConfig]]
  }
  @scala.inline
  implicit class CopyAssetsOps[Self <: CopyAssets[_, _], ProjectConfig, DependencyConfig] (val x: Self with (CopyAssets[ProjectConfig, DependencyConfig])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopyAssets(value: (js.Array[String], ProjectConfig) => Unit): Self = this.set("copyAssets", js.Any.fromFunction2(value))
    @scala.inline
    def setIsInstalled(value: (ProjectConfig, String, DependencyConfig) => Boolean): Self = this.set("isInstalled", js.Any.fromFunction3(value))
    @scala.inline
    def setRegister(value: (String, DependencyConfig, Record[String, String], ProjectConfig) => Unit): Self = this.set("register", js.Any.fromFunction4(value))
    @scala.inline
    def setUnlinkAssets(value: (js.Array[String], ProjectConfig) => Unit): Self = this.set("unlinkAssets", js.Any.fromFunction2(value))
    @scala.inline
    def setUnregister(value: (String, DependencyConfig, ProjectConfig, js.Array[DependencyConfig]) => Unit): Self = this.set("unregister", js.Any.fromFunction4(value))
  }
  
}

