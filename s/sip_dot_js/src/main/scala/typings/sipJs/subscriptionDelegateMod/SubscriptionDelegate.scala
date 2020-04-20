package typings.sipJs.subscriptionDelegateMod

import typings.sipJs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    * @param notification - A notification. See {@link Notification} for details.
    */
  def onNotify(notification: Notification): Unit
}

object SubscriptionDelegate {
  @scala.inline
  def apply(onNotify: Notification => Unit): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
    __obj.asInstanceOf[SubscriptionDelegate]
  }
}

