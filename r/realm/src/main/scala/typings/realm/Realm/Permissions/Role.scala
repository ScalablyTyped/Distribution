package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  var members: js.Array[User] = js.native
  var name: String = js.native
}

object Role {
  @scala.inline
  def apply(members: js.Array[User], name: String): Role = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: User*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[User]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

