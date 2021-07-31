package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'animation'> */
trait PickImplanimation extends StObject {
  
  var animation: String
}
object PickImplanimation {
  
  @scala.inline
  def apply(animation: String): PickImplanimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimation]
  }
  
  @scala.inline
  implicit class PickImplanimationMutableBuilder[Self <: PickImplanimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
