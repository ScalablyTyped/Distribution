package typings.reactNativeCommunityCliTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Android
import typings.reactNativeCommunityCliTypes.anon.Dictname
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-native-community/cli-types.@react-native-community/cli-types.Config, 'root'> & {  reactNativePath :string | void,   project :{  android :@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectParams | undefined,   ios :@react-native-community/cli-types.@react-native-community/cli-types/build/ios.IOSProjectParams | undefined, [key: string] : any}} */
@js.native
trait UserConfig extends js.Object {
  
  var assets: js.Array[String] = js.native
  
  var commands: js.Array[Command[`false`]] = js.native
  
  var dependencies: StringDictionary[Dependency] = js.native
  
  var platforms: Dictname = js.native
  
  var project: ProjectConfig with Android = js.native
  
  var reactNativePath: String with (String | Unit) = js.native
}
object UserConfig {
  
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command[`false`]],
    dependencies: StringDictionary[Dependency],
    platforms: Dictname,
    project: ProjectConfig with Android,
    reactNativePath: String with (String | Unit)
  ): UserConfig = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserConfig]
  }
  
  @scala.inline
  implicit class UserConfigOps[Self <: UserConfig] (val x: Self) extends AnyVal {
    
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
    def setAssetsVarargs(value: String*): Self = this.set("assets", js.Array(value :_*))
    
    @scala.inline
    def setAssets(value: js.Array[String]): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: Command[`false`]*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[Command[`false`]]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: StringDictionary[Dependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatforms(value: Dictname): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectConfig with Android): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactNativePath(value: String with (String | Unit)): Self = this.set("reactNativePath", value.asInstanceOf[js.Any])
  }
}
