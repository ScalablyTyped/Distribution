package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'movePopup'> */
trait PickImplmovePopup extends StObject {
  
  var movePopup: Boolean
}
object PickImplmovePopup {
  
  inline def apply(movePopup: Boolean): PickImplmovePopup = {
    val __obj = js.Dynamic.literal(movePopup = movePopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmovePopup]
  }
  
  extension [Self <: PickImplmovePopup](x: Self) {
    
    inline def setMovePopup(value: Boolean): Self = StObject.set(x, "movePopup", value.asInstanceOf[js.Any])
  }
}
