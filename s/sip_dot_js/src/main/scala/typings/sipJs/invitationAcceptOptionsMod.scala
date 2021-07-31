package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invitationAcceptOptionsMod {
  
  trait InvitationAcceptOptions extends StObject {
    
    /**
      * Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
    
    /**
      * Options to pass to SessionDescriptionHandler during the initial INVITE transaction.
      */
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
  }
  object InvitationAcceptOptions {
    
    @scala.inline
    def apply(): InvitationAcceptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvitationAcceptOptions]
    }
    
    @scala.inline
    implicit class InvitationAcceptOptionsMutableBuilder[Self <: InvitationAcceptOptions] (val x: Self) extends AnyVal {
      
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
    }
  }
}
