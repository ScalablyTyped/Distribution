package typings.sipJs

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiRegistererRegisterOptionsMod {
  
  trait RegistererRegisterOptions extends StObject {
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  }
  object RegistererRegisterOptions {
    
    inline def apply(): RegistererRegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistererRegisterOptions]
    }
    
    extension [Self <: RegistererRegisterOptions](x: Self) {
      
      inline def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      inline def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
}
