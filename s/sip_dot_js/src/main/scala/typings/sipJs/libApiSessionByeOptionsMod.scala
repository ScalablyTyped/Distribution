package typings.sipJs

import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSessionByeOptionsMod {
  
  trait SessionByeOptions extends StObject {
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  }
  object SessionByeOptions {
    
    inline def apply(): SessionByeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionByeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionByeOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestDelegate(value: OutgoingRequestDelegate): Self = StObject.set(x, "requestDelegate", value.asInstanceOf[js.Any])
      
      inline def setRequestDelegateUndefined: Self = StObject.set(x, "requestDelegate", js.undefined)
      
      inline def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
}
