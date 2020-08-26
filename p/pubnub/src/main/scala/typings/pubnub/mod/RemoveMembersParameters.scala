package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveMembersParameters extends GetObjectsParameters {
  var spaceId: String = js.native
  var users: js.Array[String] = js.native
}

object RemoveMembersParameters {
  @scala.inline
  def apply(spaceId: String, users: js.Array[String]): RemoveMembersParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembersParameters]
  }
  @scala.inline
  implicit class RemoveMembersParametersOps[Self <: RemoveMembersParameters] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

