package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ClassNameSettings._Impl, 'active'> */
trait PickImplactive extends StObject {
  
  var active: String
}
object PickImplactive {
  
  inline def apply(active: String): PickImplactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactive]
  }
  
  extension [Self <: PickImplactive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
