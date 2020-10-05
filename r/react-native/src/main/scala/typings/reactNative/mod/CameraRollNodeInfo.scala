package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollNodeInfo extends js.Object {
  var group_name: String = js.native
  var image: Image = js.native
  var location: js.Any = js.native
  var timestamp: Double = js.native
}

object CameraRollNodeInfo {
  @scala.inline
  def apply(group_name: String, image: Image, location: js.Any, timestamp: Double): CameraRollNodeInfo = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollNodeInfo]
  }
  @scala.inline
  implicit class CameraRollNodeInfoOps[Self <: CameraRollNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroup_name(value: String): Self = this.set("group_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: js.Any): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

