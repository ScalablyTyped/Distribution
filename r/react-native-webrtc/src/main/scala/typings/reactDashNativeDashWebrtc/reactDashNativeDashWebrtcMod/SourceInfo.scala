package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceInfo extends js.Object {
  var deviceId: String
  var facing: String
  var id: String
  var kind: String
  var label: String
}

object SourceInfo {
  @scala.inline
  def apply(deviceId: String, facing: String, id: String, kind: String, label: String): SourceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], facing = facing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceInfo]
  }
}

