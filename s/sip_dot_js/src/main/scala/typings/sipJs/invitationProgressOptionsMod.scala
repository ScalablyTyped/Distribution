package typings.sipJs

import typings.sipJs.anon.Body
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invitationProgressOptionsMod {
  
  @js.native
  trait InvitationProgressOptions extends StObject {
    
    /**
      * Body
      */
    var body: js.UndefOr[String | Body] = js.native
    
    /**
      * Array of extra headers added to the response.
      */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Reason phrase for response.
      */
    var reasonPhrase: js.UndefOr[String] = js.native
    
    /**
      * Send reliable response.
      */
    var rel100: js.UndefOr[Boolean] = js.native
    
    /**
      * Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
    
    /**
      * Options to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
    
    /**
      * Status code for response.
      */
    var statusCode: js.UndefOr[Double] = js.native
  }
  object InvitationProgressOptions {
    
    @scala.inline
    def apply(): InvitationProgressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvitationProgressOptions]
    }
    
    @scala.inline
    implicit class InvitationProgressOptionsMutableBuilder[Self <: InvitationProgressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      @scala.inline
      def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      @scala.inline
      def setRel100(value: Boolean): Self = StObject.set(x, "rel100", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRel100Undefined: Self = StObject.set(x, "rel100", js.undefined)
      
      @scala.inline
      def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value :_*))
      
      @scala.inline
      def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
