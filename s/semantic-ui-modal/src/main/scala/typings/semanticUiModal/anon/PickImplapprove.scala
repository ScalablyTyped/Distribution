package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'approve'> */
trait PickImplapprove extends StObject {
  
  var approve: String
}
object PickImplapprove {
  
  inline def apply(approve: String): PickImplapprove = {
    val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapprove]
  }
  
  extension [Self <: PickImplapprove](x: Self) {
    
    inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
  }
}
