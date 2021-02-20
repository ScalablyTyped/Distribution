package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'delay'> */
@js.native
trait PickImpldelay extends StObject {
  
  var delay: Boolean = js.native
}
object PickImpldelay {
  
  @scala.inline
  def apply(delay: Boolean): PickImpldelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelay]
  }
  
  @scala.inline
  implicit class PickImpldelayMutableBuilder[Self <: PickImpldelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
