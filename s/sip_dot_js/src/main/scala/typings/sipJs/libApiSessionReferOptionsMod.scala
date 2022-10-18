package typings.sipJs

import typings.sipJs.libApiNotificationMod.Notification
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSessionReferOptionsMod {
  
  trait SessionReferOptions extends StObject {
    
    /** Called upon receiving an incoming NOTIFY associated with a REFER. */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  }
  object SessionReferOptions {
    
    inline def apply(): SessionReferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionReferOptions]
    }
    
    extension [Self <: SessionReferOptions](x: Self) {
      
      inline def setOnNotify(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      inline def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      inline def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      inline def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
}
