package typings.snykCliInterface.pluginMod

import typings.snykCliInterface.commonMod.ScannedProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiProjectResult extends InspectResult {
  var plugin: PluginMetadata
  var scannedProjects: js.Array[ScannedProject]
}

object MultiProjectResult {
  @scala.inline
  def apply(plugin: PluginMetadata, scannedProjects: js.Array[ScannedProject]): MultiProjectResult = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], scannedProjects = scannedProjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiProjectResult]
  }
}

