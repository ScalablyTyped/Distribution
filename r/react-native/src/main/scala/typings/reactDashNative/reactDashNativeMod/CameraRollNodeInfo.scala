package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollNodeInfo extends js.Object {
  var group_name: String
  var image: Image
  var location: js.Any
  var timestamp: Double
}

object CameraRollNodeInfo {
  @scala.inline
  def apply(group_name: String, image: Image, location: js.Any, timestamp: Double): CameraRollNodeInfo = {
    val __obj = js.Dynamic.literal(group_name = group_name, image = image, location = location, timestamp = timestamp)
  
    __obj.asInstanceOf[CameraRollNodeInfo]
  }
}

