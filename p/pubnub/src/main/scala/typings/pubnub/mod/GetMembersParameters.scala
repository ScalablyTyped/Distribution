package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Member
@js.native
trait GetMembersParameters extends GetObjectsParameters {
  var spaceId: String = js.native
}

object GetMembersParameters {
  @scala.inline
  def apply(spaceId: String): GetMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersParameters]
  }
  @scala.inline
  implicit class GetMembersParametersOps[Self <: GetMembersParameters] (val x: Self) extends AnyVal {
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
    def setSpaceId(value: String): Self = this.set("spaceId", value.asInstanceOf[js.Any])
  }
  
}

