package typings.snykDockerPlugin.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginResponseStatic extends PluginResponse {
  var hashes: js.Array[String]
}

object PluginResponseStatic {
  @scala.inline
  def apply(hashes: js.Array[String], plugin: PluginMetadata, scannedProjects: js.Array[ScannedProjectCustom]): PluginResponseStatic = {
    val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], scannedProjects = scannedProjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginResponseStatic]
  }
}

