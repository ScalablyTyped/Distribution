package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.SelectorSettings._Impl, 'deny'> */
trait PickImpldeny extends StObject {
  
  var deny: String
}
object PickImpldeny {
  
  inline def apply(deny: String): PickImpldeny = {
    val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeny]
  }
  
  extension [Self <: PickImpldeny](x: Self) {
    
    inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
  }
}
