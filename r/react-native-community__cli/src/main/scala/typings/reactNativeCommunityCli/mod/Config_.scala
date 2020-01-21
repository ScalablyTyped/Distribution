package typings.reactNativeCommunityCli.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCli.AnonAndroidIos
import typings.reactNativeCommunityCli.AnonAssetsHooks
import typings.reactNativeCommunityCli.AnonPlatforms
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config_ extends js.Object {
  // An array of assets as defined by the user
  var assets: js.Array[String]
  // An array of commands that are present in 3rd party packages
  var commands: js.Array[Command]
  // Map of the dependencies that are present in the project
  var dependencies: StringDictionary[AnonAssetsHooks]
  // Haste configuration resolved based on available plugins
  var haste: AnonPlatforms
  // Map of available platforms (built-ins and dynamically loaded)
  var platforms: AnonAndroidIos
  // Object that contains configuration for a project (null, when platform not available)
  var project: Record[String, _]
  // Path to React Native source
  var reactNativePath: String
  // Root where the configuration has been resolved from
  var root: String
}

object Config_ {
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command],
    dependencies: StringDictionary[AnonAssetsHooks],
    haste: AnonPlatforms,
    platforms: AnonAndroidIos,
    project: Record[String, _],
    reactNativePath: String,
    root: String
  ): Config_ = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config_]
  }
}

