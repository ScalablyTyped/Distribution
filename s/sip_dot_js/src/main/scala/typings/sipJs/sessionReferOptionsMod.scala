package typings.sipJs

import typings.sipJs.notificationMod.Notification
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionReferOptionsMod {
  
  @js.native
  trait SessionReferOptions extends StObject {
    
    /** Called upon receiving an incoming NOTIFY associated with a REFER. */
    var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.native
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.native
  }
  object SessionReferOptions {
    
    @scala.inline
    def apply(): SessionReferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionReferOptions]
    }
    
    @scala.inline
    implicit class SessionReferOptionsMutableBuilder[Self <: SessionReferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnNotify(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onNotify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNotifyUndefined: Self = StObject.set(x, "onNotify", js.undefined)
      
      @scala.inline
      def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
}
