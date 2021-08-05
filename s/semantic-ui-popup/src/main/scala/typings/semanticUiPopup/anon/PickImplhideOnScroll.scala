package typings.semanticUiPopup.anon

import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'hideOnScroll'> */
trait PickImplhideOnScroll extends StObject {
  
  var hideOnScroll: auto | `false`
}
object PickImplhideOnScroll {
  
  inline def apply(hideOnScroll: auto | `false`): PickImplhideOnScroll = {
    val __obj = js.Dynamic.literal(hideOnScroll = hideOnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideOnScroll]
  }
  
  extension [Self <: PickImplhideOnScroll](x: Self) {
    
    inline def setHideOnScroll(value: auto | `false`): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
  }
}
