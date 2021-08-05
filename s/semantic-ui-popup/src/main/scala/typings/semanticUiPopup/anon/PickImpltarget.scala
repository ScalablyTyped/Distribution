package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'target'> */
trait PickImpltarget extends StObject {
  
  var target: `false` | String | JQuery
}
object PickImpltarget {
  
  inline def apply(target: `false` | String | JQuery): PickImpltarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltarget]
  }
  
  extension [Self <: PickImpltarget](x: Self) {
    
    inline def setTarget(value: `false` | String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
