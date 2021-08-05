package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'onHidden'> */
trait PickImplonHidden extends StObject {
  
  def onHidden($module: JQuery): Unit
  @JSName("onHidden")
  var onHidden_Original: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
}
object PickImplonHidden {
  
  inline def apply(onHidden: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): PickImplonHidden = {
    val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHidden]
  }
  
  extension [Self <: PickImplonHidden](x: Self) {
    
    inline def setOnHidden(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
  }
}
