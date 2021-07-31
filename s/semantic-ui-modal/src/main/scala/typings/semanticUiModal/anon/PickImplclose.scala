package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'close'> */
trait PickImplclose extends StObject {
  
  var close: String
}
object PickImplclose {
  
  @scala.inline
  def apply(close: String): PickImplclose = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclose]
  }
  
  @scala.inline
  implicit class PickImplcloseMutableBuilder[Self <: PickImplclose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
  }
}
