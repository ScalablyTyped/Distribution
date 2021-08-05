package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'delay'> */
trait PickImpldelay extends StObject {
  
  var delay: Boolean
}
object PickImpldelay {
  
  inline def apply(delay: Boolean): PickImpldelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelay]
  }
  
  extension [Self <: PickImpldelay](x: Self) {
    
    inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
