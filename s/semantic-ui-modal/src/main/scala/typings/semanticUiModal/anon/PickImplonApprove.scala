package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'onApprove'> */
trait PickImplonApprove extends StObject {
  
  def onApprove($element: JQuery): `false` | Unit
  @JSName("onApprove")
  var onApprove_Original: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
}
object PickImplonApprove {
  
  @scala.inline
  def apply(onApprove: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): PickImplonApprove = {
    val __obj = js.Dynamic.literal(onApprove = onApprove.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonApprove]
  }
  
  @scala.inline
  implicit class PickImplonApproveMutableBuilder[Self <: PickImplonApprove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnApprove(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = StObject.set(x, "onApprove", value.asInstanceOf[js.Any])
  }
}
