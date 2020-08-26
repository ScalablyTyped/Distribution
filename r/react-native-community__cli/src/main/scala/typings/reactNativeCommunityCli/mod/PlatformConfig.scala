package typings.reactNativeCommunityCli.mod

import typings.reactNativeCommunityCli.anon.CopyAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] extends js.Object {
  def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig = js.native
  def linkConfig(): CopyAssets[ProjectConfig, DependencyConfig] = js.native
  def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig = js.native
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
  @scala.inline
  implicit class PlatformConfigOps[Self <: PlatformConfig[_, _, _, _], ProjectParams, DependencyParams, ProjectConfig, DependencyConfig] (val x: Self with (PlatformConfig[ProjectParams, DependencyParams, ProjectConfig, DependencyConfig])) extends AnyVal {
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
    def setDependencyConfig(value: (String, DependencyParams) => DependencyConfig): Self = this.set("dependencyConfig", js.Any.fromFunction2(value))
    @scala.inline
    def setLinkConfig(value: () => CopyAssets[ProjectConfig, DependencyConfig]): Self = this.set("linkConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setProjectConfig(value: (String, ProjectParams) => ProjectConfig): Self = this.set("projectConfig", js.Any.fromFunction2(value))
  }
  
}

