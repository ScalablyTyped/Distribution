package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'onHide'> */
trait PickImplonHide extends StObject {
  
  def onHide($element: JQuery): `false` | Unit
  @JSName("onHide")
  var onHide_Original: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
}
object PickImplonHide {
  
  @scala.inline
  def apply(onHide: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): PickImplonHide = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHide]
  }
  
  @scala.inline
  implicit class PickImplonHideMutableBuilder[Self <: PickImplonHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHide(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
  }
}
