package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomSubscription extends js.Object {
  var disableCursors: Boolean = js.native
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.native
  var messageLimit: Double = js.native
  var roomId: String = js.native
  def cancel(): js.Promise[Unit] = js.native
}

object RoomSubscription {
  @scala.inline
  def apply(cancel: () => js.Promise[Unit], disableCursors: Boolean, messageLimit: Double, roomId: String): RoomSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubscription]
  }
  @scala.inline
  implicit class RoomSubscriptionOps[Self <: RoomSubscription] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setDisableCursors(value: Boolean): Self = this.set("disableCursors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageLimit(value: Double): Self = this.set("messageLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomId(value: String): Self = this.set("roomId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooks(value: RoomSubscriptionHooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
  
}

