package typings.semanticUiPopup.anon

import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'delay'> */
trait PickImpldelay extends StObject {
  
  var delay: DelaySettings
}
object PickImpldelay {
  
  inline def apply(delay: DelaySettings): PickImpldelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelay]
  }
  
  extension [Self <: PickImpldelay](x: Self) {
    
    inline def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
