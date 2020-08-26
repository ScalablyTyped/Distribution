package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IROOM_GROUP_SUBSCRIBE extends js.Object {
  var groupId: String = js.native
  var newRooms: js.Array[SFSRoom] = js.native
}

object IROOM_GROUP_SUBSCRIBE {
  @scala.inline
  def apply(groupId: String, newRooms: js.Array[SFSRoom]): IROOM_GROUP_SUBSCRIBE = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], newRooms = newRooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_GROUP_SUBSCRIBE]
  }
  @scala.inline
  implicit class IROOM_GROUP_SUBSCRIBEOps[Self <: IROOM_GROUP_SUBSCRIBE] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewRoomsVarargs(value: SFSRoom*): Self = this.set("newRooms", js.Array(value :_*))
    @scala.inline
    def setNewRooms(value: js.Array[SFSRoom]): Self = this.set("newRooms", value.asInstanceOf[js.Any])
  }
  
}

