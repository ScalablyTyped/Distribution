package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAllGroupsResponse extends js.Object {
  var groups: js.Array[String] = js.native
}

object ListAllGroupsResponse {
  @scala.inline
  def apply(groups: js.Array[String]): ListAllGroupsResponse = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllGroupsResponse]
  }
  @scala.inline
  implicit class ListAllGroupsResponseOps[Self <: ListAllGroupsResponse] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
  }
  
}

