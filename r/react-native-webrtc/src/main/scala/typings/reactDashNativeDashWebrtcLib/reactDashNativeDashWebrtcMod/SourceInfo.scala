package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceInfo extends js.Object {
  var deviceId: java.lang.String
  var facing: java.lang.String
  var id: java.lang.String
  var kind: java.lang.String
  var label: java.lang.String
}

object SourceInfo {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    facing: java.lang.String,
    id: java.lang.String,
    kind: java.lang.String,
    label: java.lang.String
  ): SourceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, facing = facing, id = id, kind = kind, label = label)
  
    __obj.asInstanceOf[SourceInfo]
  }
}

