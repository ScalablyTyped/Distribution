package typings.pusherChatkitClient.roomMod

import typings.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PusherRoom extends js.Object {
  
  var createdAt: String = js.native
  
  var createdByUserId: String = js.native
  
  var customData: js.UndefOr[js.Any] = js.native
  
  var id: String = js.native
  
  var isPrivate: Boolean = js.native
  
  var lastMessageAt: String = js.native
  
  var name: String = js.native
  
  var unreadCount: Double = js.native
  
  var updatedAt: String = js.native
  
  var users: js.Array[PusherUser] = js.native
}
object PusherRoom {
  
  @scala.inline
  def apply(
    createdAt: String,
    createdByUserId: String,
    id: String,
    isPrivate: Boolean,
    lastMessageAt: String,
    name: String,
    unreadCount: Double,
    updatedAt: String,
    users: js.Array[PusherUser]
  ): PusherRoom = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], lastMessageAt = lastMessageAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unreadCount = unreadCount.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PusherRoom]
  }
  
  @scala.inline
  implicit class PusherRoomOps[Self <: PusherRoom] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUserId(value: String): Self = this.set("createdByUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMessageAt(value: String): Self = this.set("lastMessageAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreadCount(value: Double): Self = this.set("unreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: PusherUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[PusherUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
}
