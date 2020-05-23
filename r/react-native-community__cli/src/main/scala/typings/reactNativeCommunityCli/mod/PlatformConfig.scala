package typings.reactNativeCommunityCli.mod

import typings.reactNativeCommunityCli.anon.CopyAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] extends js.Object {
  def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig
  def linkConfig(): CopyAssets[ProjectConfig, DependencyConfig]
  def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig
}

object PlatformConfig {
  @scala.inline
  def apply[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig](
    dependencyConfig: (String, DependencyParams) => DependencyConfig,
    linkConfig: () => CopyAssets[ProjectConfig, DependencyConfig],
    projectConfig: (String, ProjectParams) => ProjectConfig
  ): PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] = {
    val __obj = js.Dynamic.literal(dependencyConfig = js.Any.fromFunction2(dependencyConfig), linkConfig = js.Any.fromFunction0(linkConfig), projectConfig = js.Any.fromFunction2(projectConfig))
    __obj.asInstanceOf[PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig]]
  }
}

