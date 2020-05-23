package typings.snykCliInterface.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorMeta extends js.Object {
  var ci: Boolean
  var dockerBaseImage: js.UndefOr[String] = js.undefined
  var dockerImageId: js.UndefOr[String] = js.undefined
  var hostname: String
  var id: String
  var master: Boolean
  var method: js.UndefOr[String] = js.undefined
  var name: String
  var node: String
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
  var pid: Double
  var pluginName: String
  var pluginRuntime: String
  var projectName: String
  var version: String
}

object MonitorMeta {
  @scala.inline
  def apply(
    ci: Boolean,
    hostname: String,
    id: String,
    master: Boolean,
    name: String,
    node: String,
    pid: Double,
    pluginName: String,
    pluginRuntime: String,
    projectName: String,
    version: String,
    dockerBaseImage: String = null,
    dockerImageId: String = null,
    method: String = null,
    org_ : String = null
  ): MonitorMeta = {
    val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginRuntime = pluginRuntime.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (dockerBaseImage != null) __obj.updateDynamic("dockerBaseImage")(dockerBaseImage.asInstanceOf[js.Any])
    if (dockerImageId != null) __obj.updateDynamic("dockerImageId")(dockerImageId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (org_ != null) __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorMeta]
  }
}

