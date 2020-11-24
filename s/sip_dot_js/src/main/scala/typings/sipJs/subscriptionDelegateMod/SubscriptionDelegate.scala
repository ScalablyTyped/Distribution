package typings.sipJs.subscriptionDelegateMod

import typings.sipJs.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionDelegate extends js.Object {
  
  /**
    * Called upon receiving an incoming NOTIFY request.
    * @param notification - A notification. See {@link Notification} for details.
    */
  def onNotify(notification: Notification): Unit = js.native
}
object SubscriptionDelegate {
  
  @scala.inline
  def apply(onNotify: Notification => Unit): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
    __obj.asInstanceOf[SubscriptionDelegate]
  }
  
  @scala.inline
  implicit class SubscriptionDelegateOps[Self <: SubscriptionDelegate] (val x: Self) extends AnyVal {
    
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
    def setOnNotify(value: Notification => Unit): Self = this.set("onNotify", js.Any.fromFunction1(value))
  }
}
