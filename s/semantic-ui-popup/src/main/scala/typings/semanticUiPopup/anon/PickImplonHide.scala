package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onHide'> */
trait PickImplonHide extends StObject {
  
  def onHide($module: JQuery): `false` | Unit
  @JSName("onHide")
  var onHide_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
}
object PickImplonHide {
  
  inline def apply(onHide: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): PickImplonHide = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHide]
  }
  
  extension [Self <: PickImplonHide](x: Self) {
    
    inline def setOnHide(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
  }
}
