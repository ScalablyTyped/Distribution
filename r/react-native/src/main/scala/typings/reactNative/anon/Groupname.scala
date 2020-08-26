package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groupname extends js.Object {
  var group_name: String = js.native
  var image: IsStored = js.native
  var location: Altitude = js.native
  var timestamp: Double = js.native
  var `type`: String = js.native
}

object Groupname {
  @scala.inline
  def apply(group_name: String, image: IsStored, location: Altitude, timestamp: Double, `type`: String): Groupname = {
    val __obj = js.Dynamic.literal(group_name = group_name.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupname]
  }
  @scala.inline
  implicit class GroupnameOps[Self <: Groupname] (val x: Self) extends AnyVal {
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
    def setImage(value: IsStored): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Altitude): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

