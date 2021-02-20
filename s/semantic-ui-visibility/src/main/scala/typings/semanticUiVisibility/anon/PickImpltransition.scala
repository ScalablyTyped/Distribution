package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'transition'> */
@js.native
trait PickImpltransition extends StObject {
  
  var transition: `false` | String = js.native
}
object PickImpltransition {
  
  @scala.inline
  def apply(transition: `false` | String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  
  @scala.inline
  implicit class PickImpltransitionMutableBuilder[Self <: PickImpltransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransition(value: `false` | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
