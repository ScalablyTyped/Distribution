package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'approve'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
trait PickImplapprovePartialPic
  extends StObject
     with Param {
  
  var approve: String
  
  var close: js.UndefOr[String] = js.undefined
  
  var deny: js.UndefOr[String] = js.undefined
}
object PickImplapprovePartialPic {
  
  inline def apply(approve: String): PickImplapprovePartialPic = {
    val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapprovePartialPic]
  }
  
  extension [Self <: PickImplapprovePartialPic](x: Self) {
    
    inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
  }
}
