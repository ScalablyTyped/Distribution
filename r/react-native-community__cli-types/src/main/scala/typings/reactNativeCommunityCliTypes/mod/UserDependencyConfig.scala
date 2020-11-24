package typings.reactNativeCommunityCliTypes.mod

import typings.reactNativeCommunityCliTypes.anon.Dictname
import typings.reactNativeCommunityCliTypes.anon.OmitDependencynameroot
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDependencyConfig extends js.Object {
  
  var commands: js.Array[Command[`false`]] = js.native
  
  var dependency: OmitDependencynameroot = js.native
  
  var platforms: Dictname = js.native
}
object UserDependencyConfig {
  
  @scala.inline
  def apply(commands: js.Array[Command[`false`]], dependency: OmitDependencynameroot, platforms: Dictname): UserDependencyConfig = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any])
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
    def setCommandsVarargs(value: Command[`false`]*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[Command[`false`]]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependency(value: OmitDependencynameroot): Self = this.set("dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatforms(value: Dictname): Self = this.set("platforms", value.asInstanceOf[js.Any])
  }
}
