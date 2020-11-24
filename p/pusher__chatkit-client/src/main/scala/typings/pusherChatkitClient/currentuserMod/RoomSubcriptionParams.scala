package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSubcriptionParams extends js.Object {
  
  var disableCursors: js.UndefOr[Boolean] = js.native
  
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
  
  var messageLimit: js.UndefOr[Double] = js.native
  
  var roomId: String = js.native
}
object RoomSubcriptionParams {
  
  @scala.inline
  def apply(roomId: String): RoomSubcriptionParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubcriptionParams]
  }
  
  @scala.inline
  implicit class RoomSubcriptionParamsOps[Self <: RoomSubcriptionParams] (val x: Self) extends AnyVal {
    
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
    def setRoomId(value: String): Self = this.set("roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCursors(value: Boolean): Self = this.set("disableCursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCursors: Self = this.set("disableCursors", js.undefined)
    
    @scala.inline
    def setHooks(value: RoomSubscriptionHooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setMessageLimit(value: Double): Self = this.set("messageLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageLimit: Self = this.set("messageLimit", js.undefined)
  }
}
