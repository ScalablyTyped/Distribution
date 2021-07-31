package typings.semanticUiModal.anon

import typings.semanticUiModal.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'onHidden'> */
trait PickImplonHidden extends StObject {
  
  def onHidden(): Unit
  @JSName("onHidden")
  var onHidden_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonHidden {
  
  @scala.inline
  def apply(onHidden: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonHidden = {
    val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHidden]
  }
  
  @scala.inline
  implicit class PickImplonHiddenMutableBuilder[Self <: PickImplonHidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHidden(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
  }
}
