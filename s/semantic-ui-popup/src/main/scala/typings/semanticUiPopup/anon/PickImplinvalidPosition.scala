package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'invalidPosition'> */
trait PickImplinvalidPosition extends StObject {
  
  var invalidPosition: String
}
object PickImplinvalidPosition {
  
  @scala.inline
  def apply(invalidPosition: String): PickImplinvalidPosition = {
    val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidPosition]
  }
  
  @scala.inline
  implicit class PickImplinvalidPositionMutableBuilder[Self <: PickImplinvalidPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
  }
}
