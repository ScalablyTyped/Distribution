package typings.snykDockerPlugin.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMetadata extends js.Object {
  var dockerImageId: String
  var imageLayers: js.Array[String]
  var name: String
  var packageManager: js.Any
  var runtime: js.UndefOr[String] = js.undefined
}

object PluginMetadata {
  @scala.inline
  def apply(
    dockerImageId: String,
    imageLayers: js.Array[String],
    name: String,
    packageManager: js.Any,
    runtime: String = null
  ): PluginMetadata = {
    val __obj = js.Dynamic.literal(dockerImageId = dockerImageId.asInstanceOf[js.Any], imageLayers = imageLayers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMetadata]
  }
}

