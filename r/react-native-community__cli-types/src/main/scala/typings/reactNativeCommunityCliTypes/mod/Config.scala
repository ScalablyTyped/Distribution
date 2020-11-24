package typings.reactNativeCommunityCliTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliTypes.anon.Dictname
import typings.reactNativeCommunityCliTypes.iosMod.IOSNativeModulesConfig
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends IOSNativeModulesConfig {
  
  var assets: js.Array[String] = js.native
  
  var commands: js.Array[Command[`false`]] = js.native
  
  @JSName("dependencies")
  var dependencies_Config: StringDictionary[Dependency] = js.native
  
  var platforms: Dictname = js.native
  
  @JSName("project")
  var project_Config: ProjectConfig = js.native
  
  var root: String = js.native
}
object Config {
  
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command[`false`]],
    dependencies: StringDictionary[Dependency],
    platforms: Dictname,
    project: ProjectConfig,
    reactNativePath: String,
    root: String
  ): Config = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setProject(value: ProjectConfig): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
