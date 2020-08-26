package typings.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDependencyConfig extends js.Object {
  // An array of commands that ship with the dependency
  var commands: js.Array[Command] = js.native
  // Additional dependency settings
  var dependency: js.UndefOr[typings.reactNativeCommunityCli.anon.Hooks] = js.native
  // Haste config defined by legacy `rnpm`
  var haste: js.UndefOr[typings.reactNativeCommunityCli.anon.Platforms] = js.native
  // An array of extra platforms to load
  var platforms: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object UserDependencyConfig {
  @scala.inline
  def apply(commands: js.Array[Command]): UserDependencyConfig = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDependencyConfig]
  }
  @scala.inline
  implicit class UserDependencyConfigOps[Self <: UserDependencyConfig] (val x: Self) extends AnyVal {
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
    def setCommandsVarargs(value: Command*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[Command]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependency(value: typings.reactNativeCommunityCli.anon.Hooks): Self = this.set("dependency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependency: Self = this.set("dependency", js.undefined)
    @scala.inline
    def setHaste(value: typings.reactNativeCommunityCli.anon.Platforms): Self = this.set("haste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaste: Self = this.set("haste", js.undefined)
    @scala.inline
    def setPlatforms(value: StringDictionary[js.Any]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
  }
  
}

