package typings.sipJs.anon

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionDescriptionHandlerModifiers extends StObject {
  
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}
object SessionDescriptionHandlerModifiers {
  
  @scala.inline
  def apply(): SessionDescriptionHandlerModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerModifiers]
  }
  
  @scala.inline
  implicit class SessionDescriptionHandlerModifiersMutableBuilder[Self <: SessionDescriptionHandlerModifiers] (val x: Self) extends AnyVal {
    
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
