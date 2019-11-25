package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.atReactDashNativeDashCommunityCli.Anon_AndroidIos
import typings.atReactDashNativeDashCommunityCli.Anon_AssetsHooks
import typings.atReactDashNativeDashCommunityCli.Anon_Platforms
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  // An array of assets as defined by the user
  var assets: js.Array[String]
  // An array of commands that are present in 3rd party packages
  var commands: js.Array[Command]
  // Map of the dependencies that are present in the project
  var dependencies: StringDictionary[Anon_AssetsHooks]
  // Haste configuration resolved based on available plugins
  var haste: Anon_Platforms
  // Map of available platforms (built-ins and dynamically loaded)
  var platforms: Anon_AndroidIos
  // Object that contains configuration for a project (null, when platform not available)
  var project: Record[String, _]
  // Path to React Native source
  var reactNativePath: String
  // Root where the configuration has been resolved from
  var root: String
}

object Config {
  @scala.inline
  def apply(
    assets: js.Array[String],
    commands: js.Array[Command],
    dependencies: StringDictionary[Anon_AssetsHooks],
    haste: Anon_Platforms,
    platforms: Anon_AndroidIos,
    project: Record[String, _],
    reactNativePath: String,
    root: String
  ): Config = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNativePath = reactNativePath.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

@JSImport("@react-native-community/cli", "config")
@js.native
object config extends TopLevel[Config]

