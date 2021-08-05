package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplApprove extends StObject {
  
  var approve: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[String] = js.undefined
  
  var deny: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplApprove {
  
  inline def apply(): PartialPickImplkeyofImplApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplApprove]
  }
  
  extension [Self <: PartialPickImplkeyofImplApprove](x: Self) {
    
    inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
  }
}
