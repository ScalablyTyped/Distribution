package typings.semanticUiTransition.anon

import typings.semanticUiTransition.semanticUiTransitionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'displayType'> */
@js.native
trait PickImpldisplayType extends StObject {
  
  var displayType: `false` | String = js.native
}
object PickImpldisplayType {
  
  @scala.inline
  def apply(displayType: `false` | String): PickImpldisplayType = {
    val __obj = js.Dynamic.literal(displayType = displayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisplayType]
  }
  
  @scala.inline
  implicit class PickImpldisplayTypeMutableBuilder[Self <: PickImpldisplayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayType(value: `false` | String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
  }
}
