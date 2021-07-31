package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'selector'> */
trait PickImplselector extends StObject {
  
  var selector: SelectorSettings
}
object PickImplselector {
  
  @scala.inline
  def apply(selector: SelectorSettings): PickImplselector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselector]
  }
  
  @scala.inline
  implicit class PickImplselectorMutableBuilder[Self <: PickImplselector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
