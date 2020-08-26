package typings.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.anon.Assets
import typings.reactNativeCommunityCli.anon.Dictname
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends js.Object {
  // An array of assets as defined by the user
  var assets: js.Array[String] = js.native
  // An array of commands that are present in 3rd party packages
  var commands: js.Array[Command] = js.native
  // Map of the dependencies that are present in the project
  var dependencies: StringDictionary[Assets] = js.native
  // Haste configuration resolved based on available plugins
  var haste: typings.reactNativeCommunityCli.anon.Platforms = js.native
  // Map of available platforms (built-ins and dynamically loaded)
  var platforms: Dictname = js.native
  // Object that contains configuration for a project (null, when platform not available)
  var project: Record[String, _] = js.native
  // Path to React Native source
  var reactNativePath: String = js.native
  // Root where the configuration has been resolved from
  var root: String = js.native
}

object Config_ {
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command],
    dependencies: StringDictionary[Assets],
    haste: typings.reactNativeCommunityCli.anon.Platforms,
    platforms: Dictname,
    project: Record[String, _],
    reactNativePath: String,
    root: String
  ): Config_ = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
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
    def setCommandsVarargs(value: Command*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[Command]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencies(value: StringDictionary[Assets]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setHaste(value: typings.reactNativeCommunityCli.anon.Platforms): Self = this.set("haste", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatforms(value: Dictname): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: Record[String, _]): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setReactNativePath(value: String): Self = this.set("reactNativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

