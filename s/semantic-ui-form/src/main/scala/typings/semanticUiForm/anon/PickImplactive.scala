package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'active'> */
@js.native
trait PickImplactive extends StObject {
  
  var active: String = js.native
}
object PickImplactive {
  
  @scala.inline
  def apply(active: String): PickImplactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactive]
  }
  
  @scala.inline
  implicit class PickImplactiveMutableBuilder[Self <: PickImplactive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
