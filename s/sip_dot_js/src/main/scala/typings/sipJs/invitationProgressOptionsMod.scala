package typings.sipJs

import typings.sipJs.anon.Body
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invitationProgressOptionsMod {
  
  trait InvitationProgressOptions extends StObject {
    
    /**
      * Body
      */
    var body: js.UndefOr[String | Body] = js.undefined
    
    /**
      * Array of extra headers added to the response.
      */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Reason phrase for response.
      */
    var reasonPhrase: js.UndefOr[String] = js.undefined
    
    /**
      * Send reliable response.
      */
    var rel100: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
    
    /**
      * Options to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
    
    /**
      * Status code for response.
      */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object InvitationProgressOptions {
    
    inline def apply(): InvitationProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvitationProgressOptions]
    }
    
    extension [Self <: InvitationProgressOptions](x: Self) {
      
      inline def setBody(value: String | Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      inline def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      inline def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      inline def setRel100(value: Boolean): Self = StObject.set(x, "rel100", value.asInstanceOf[js.Any])
      
      inline def setRel100Undefined: Self = StObject.set(x, "rel100", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      inline def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value :_*))
      
      inline def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
