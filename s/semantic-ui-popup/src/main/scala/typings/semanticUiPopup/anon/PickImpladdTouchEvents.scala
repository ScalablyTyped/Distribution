package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'addTouchEvents'> */
trait PickImpladdTouchEvents extends StObject {
  
  var addTouchEvents: Boolean
}
object PickImpladdTouchEvents {
  
  inline def apply(addTouchEvents: Boolean): PickImpladdTouchEvents = {
    val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdTouchEvents]
  }
  
  extension [Self <: PickImpladdTouchEvents](x: Self) {
    
    inline def setAddTouchEvents(value: Boolean): Self = StObject.set(x, "addTouchEvents", value.asInstanceOf[js.Any])
  }
}
