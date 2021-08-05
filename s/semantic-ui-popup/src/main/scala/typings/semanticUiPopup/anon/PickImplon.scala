package typings.semanticUiPopup.anon

import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'on'> */
trait PickImplon extends StObject {
  
  var on: focus | click | hover | manual
}
object PickImplon {
  
  inline def apply(on: focus | click | hover | manual): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplon]
  }
  
  extension [Self <: PickImplon](x: Self) {
    
    inline def setOn(value: focus | click | hover | manual): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
