package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'deny'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl>> */
trait PickImpldenyPartialPickIm
  extends StObject
     with Param {
  
  var approve: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[String] = js.undefined
  
  var deny: String & js.UndefOr[String]
}
object PickImpldenyPartialPickIm {
  
  inline def apply(deny: String & js.UndefOr[String]): PickImpldenyPartialPickIm = {
    val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldenyPartialPickIm]
  }
  
  extension [Self <: PickImpldenyPartialPickIm](x: Self) {
    
    inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
    
    inline def setApproveUndefined: Self = StObject.set(x, "approve", js.undefined)
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDeny(value: String & js.UndefOr[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
  }
}
