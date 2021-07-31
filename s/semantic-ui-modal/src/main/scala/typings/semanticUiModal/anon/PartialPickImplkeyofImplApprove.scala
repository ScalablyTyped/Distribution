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
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplApprove]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplApproveMutableBuilder[Self <: PartialPickImplkeyofImplApprove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
  }
}
