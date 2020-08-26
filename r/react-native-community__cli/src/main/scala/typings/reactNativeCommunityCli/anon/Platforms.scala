package typings.reactNativeCommunityCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platforms extends js.Object {
  var platforms: js.Array[String] = js.native
  var providesModuleNodeModules: js.Array[String] = js.native
}

object Platforms {
  @scala.inline
  def apply(platforms: js.Array[String], providesModuleNodeModules: js.Array[String]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], providesModuleNodeModules = providesModuleNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  @scala.inline
  implicit class PlatformsOps[Self <: Platforms] (val x: Self) extends AnyVal {
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
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidesModuleNodeModulesVarargs(value: String*): Self = this.set("providesModuleNodeModules", js.Array(value :_*))
    @scala.inline
    def setProvidesModuleNodeModules(value: js.Array[String]): Self = this.set("providesModuleNodeModules", value.asInstanceOf[js.Any])
  }
  
}

