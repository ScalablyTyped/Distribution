package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'useFailSafe'> */
@js.native
trait PickImpluseFailSafe extends StObject {
  
  var useFailSafe: Boolean = js.native
}
object PickImpluseFailSafe {
  
  @scala.inline
  def apply(useFailSafe: Boolean): PickImpluseFailSafe = {
    val __obj = js.Dynamic.literal(useFailSafe = useFailSafe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseFailSafe]
  }
  
  @scala.inline
  implicit class PickImpluseFailSafeMutableBuilder[Self <: PickImpluseFailSafe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseFailSafe(value: Boolean): Self = StObject.set(x, "useFailSafe", value.asInstanceOf[js.Any])
  }
}
