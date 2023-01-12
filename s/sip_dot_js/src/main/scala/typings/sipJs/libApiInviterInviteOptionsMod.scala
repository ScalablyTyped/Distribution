package typings.sipJs

import typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiInviterInviteOptionsMod {
  
  trait InviterInviteOptions extends StObject {
    
    /**
      * See `core` API.
      */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
    
    /**
      * See `core` API.
      */
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
    
    /**
      * Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
    
    /**
      * Options to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
    
    /**
      * If true, send INVITE without SDP. Default is false.
      */
    var withoutSdp: js.UndefOr[Boolean] = js.undefined
  }
  object InviterInviteOptions {
    
    inline def apply(): InviterInviteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviterInviteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InviterInviteOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      inline def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value*))
      
      inline def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
      
      inline def setWithoutSdp(value: Boolean): Self = StObject.set(x, "withoutSdp", value.asInstanceOf[js.Any])
      
      inline def setWithoutSdpUndefined: Self = StObject.set(x, "withoutSdp", js.undefined)
    }
  }
}
