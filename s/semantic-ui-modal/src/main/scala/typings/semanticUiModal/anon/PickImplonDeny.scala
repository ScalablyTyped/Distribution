package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import typings.semanticUiModal.semanticUiModalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'onDeny'> */
trait PickImplonDeny extends StObject {
  
  def onDeny($element: JQuery): `false` | Unit
  @JSName("onDeny")
  var onDeny_Original: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]
}
object PickImplonDeny {
  
  @scala.inline
  def apply(onDeny: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): PickImplonDeny = {
    val __obj = js.Dynamic.literal(onDeny = onDeny.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDeny]
  }
  
  @scala.inline
  implicit class PickImplonDenyMutableBuilder[Self <: PickImplonDeny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDeny(value: js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]): Self = StObject.set(x, "onDeny", value.asInstanceOf[js.Any])
  }
}
