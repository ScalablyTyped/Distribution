package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaveSpacesParameters extends GetObjectsParameters {
  var spaces: js.Array[String] = js.native
  var userId: String = js.native
}

object LeaveSpacesParameters {
  @scala.inline
  def apply(spaces: js.Array[String], userId: String): LeaveSpacesParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaveSpacesParameters]
  }
  @scala.inline
  implicit class LeaveSpacesParametersOps[Self <: LeaveSpacesParameters] (val x: Self) extends AnyVal {
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
    def setSpacesVarargs(value: String*): Self = this.set("spaces", js.Array(value :_*))
    @scala.inline
    def setSpaces(value: js.Array[String]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

