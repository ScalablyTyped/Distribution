package typings.sipJs

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMessageOptionsMod {
  
  trait SessionMessageOptions extends StObject {
    
    /** See `core` API. */
    var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.undefined
    
    /** See `core` API. */
    var requestOptions: js.UndefOr[RequestOptions] = js.undefined
  }
  object SessionMessageOptions {
    
    @scala.inline
    def apply(): SessionMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionMessageOptions]
    }
    
    @scala.inline
    implicit class SessionMessageOptionsMutableBuilder[Self <: SessionMessageOptions] (val x: Self) extends AnyVal {
      
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
