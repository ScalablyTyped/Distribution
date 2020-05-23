package typings.snykDockerPlugin.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginResponse extends js.Object {
  var plugin: PluginMetadata
  var scannedProjects: js.Array[ScannedProjectCustom]
}

object PluginResponse {
  @scala.inline
  def apply(plugin: PluginMetadata, scannedProjects: js.Array[ScannedProjectCustom]): PluginResponse = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], scannedProjects = scannedProjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginResponse]
  }
}

