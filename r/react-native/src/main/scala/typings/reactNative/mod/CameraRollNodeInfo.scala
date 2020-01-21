package typings.reactNative.mod

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
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CameraRollNodeInfo]
  }
}

