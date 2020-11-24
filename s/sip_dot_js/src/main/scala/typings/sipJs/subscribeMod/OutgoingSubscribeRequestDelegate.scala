package typings.sipJs.subscribeMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingSubscribeRequestDelegate extends OutgoingRequestDelegate {
  
  /**
    * Received the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    * @param request - Incoming NOTIFY request (including a Subscription).
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.native
  
  /**
    * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    */
  var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.native
}
object OutgoingSubscribeRequestDelegate {
  
  @scala.inline
  def apply(): OutgoingSubscribeRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
  }
  
  @scala.inline
  implicit class OutgoingSubscribeRequestDelegateOps[Self <: OutgoingSubscribeRequestDelegate] (val x: Self) extends AnyVal {
    
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
    def setOnNotify(value: /* request */ IncomingRequestWithSubscription => Unit): Self = this.set("onNotify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNotify: Self = this.set("onNotify", js.undefined)
    
    @scala.inline
    def setOnNotifyTimeout(value: () => Unit): Self = this.set("onNotifyTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNotifyTimeout: Self = this.set("onNotifyTimeout", js.undefined)
  }
}
