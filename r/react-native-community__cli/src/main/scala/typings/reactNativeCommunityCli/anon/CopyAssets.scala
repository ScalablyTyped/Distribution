package typings.reactNativeCommunityCli.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyAssets[ProjectConfig, DependencyConfig] extends js.Object {
  def copyAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit
  def isInstalled(projectConfig: ProjectConfig, name: String, dependencyConfig: DependencyConfig): Boolean
  def register(
    name: String,
    dependencyConfig: DependencyConfig,
    params: Record[String, String],
    projectConfig: ProjectConfig
  ): Unit
  def unlinkAssets(assets: js.Array[String], projectConfig: ProjectConfig): Unit
  def unregister(
    packageName: String,
    dependencyConfig: DependencyConfig,
    projectConfig: ProjectConfig,
    otherDependencies: js.Array[DependencyConfig]
  ): Unit
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
}

