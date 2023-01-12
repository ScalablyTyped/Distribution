package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSubscriptionSubscriptionDelegateMod {
  
  trait SubscriptionDelegate extends StObject {
    
    /**
      * Receive NOTIFY request. This includes in dialog NOTIFY requests only.
      * Thus the first NOTIFY (the subscription creating NOTIFY) will not be provided.
      * https://tools.ietf.org/html/rfc6665#section-4.1.3
      * @param request - Incoming NOTIFY request.
      */
    var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
    
    /**
      * Sent a SUBSCRIBE request. This includes "auto refresh" in dialog SUBSCRIBE requests only.
      * Thus SUBSCRIBE requests triggered by calls to `refresh()` or `subscribe()` will not be provided.
      * Thus the first SUBSCRIBE (the subscription creating SUBSCRIBE) will not be provided.
      * @param request - Outgoing SUBSCRIBE request.
      */
    var onRefresh: js.UndefOr[js.Function1[/* request */ OutgoingSubscribeRequest, Unit]] = js.undefined
    
    /**
      * Subscription termination. This includes non-NOTIFY termination causes only.
      * Thus this will not be called if a NOTIFY is the cause of termination.
      * https://tools.ietf.org/html/rfc6665#section-4.4.1
      */
    var onTerminated: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SubscriptionDelegate {
    
    inline def apply(): SubscriptionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionDelegate] (val x: Self) extends AnyVal {
      
      inline def setOnNotify(value: /* request */ IncomingNotifyRequest => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setOnRefresh(value: /* request */ OutgoingSubscribeRequest => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction1(value))
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setOnTerminated(value: () => Unit): Self = StObject.set(x, "onTerminated", js.Any.fromFunction0(value))
      
      inline def setOnTerminatedUndefined: Self = StObject.set(x, "onTerminated", js.undefined)
    }
  }
}
