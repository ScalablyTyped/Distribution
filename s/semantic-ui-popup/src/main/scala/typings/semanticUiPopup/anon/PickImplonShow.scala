package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onShow'> */
trait PickImplonShow extends StObject {
  
  def onShow($module: JQuery): `false` | Unit
  @JSName("onShow")
  var onShow_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
}
object PickImplonShow {
  
  inline def apply(onShow: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): PickImplonShow = {
    val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonShow]
  }
  
  extension [Self <: PickImplonShow](x: Self) {
    
    inline def setOnShow(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
  }
}
