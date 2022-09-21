package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'close'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
trait PickImplclosePartialPickI
  extends StObject
     with Param {
  
  var approve: js.UndefOr[String] = js.undefined
  
  var close: String & js.UndefOr[String]
  
  var deny: js.UndefOr[String] = js.undefined
}
object PickImplclosePartialPickI {
  
  inline def apply(close: String & js.UndefOr[String]): PickImplclosePartialPickI = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclosePartialPickI]
  }
  
  extension [Self <: PickImplclosePartialPickI](x: Self) {
    
    inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    inline def setClose(value: String & js.UndefOr[String]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
  }
}
