package typings.atPusherChatkitDashClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomSubscription extends js.Object {
  var disableCursors: Boolean
  var hooks: js.UndefOr[RoomSubscriptionHooks] = js.undefined
  var messageLimit: Double
  var roomId: String
  def cancel(): js.Promise[Unit]
}

object RoomSubscription {
  @scala.inline
  def apply(
    cancel: () => js.Promise[Unit],
    disableCursors: Boolean,
    messageLimit: Double,
    roomId: String,
    hooks: RoomSubscriptionHooks = null
  ): RoomSubscription = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), disableCursors = disableCursors.asInstanceOf[js.Any], messageLimit = messageLimit.asInstanceOf[js.Any], roomId = roomId.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSubscription]
  }
}

