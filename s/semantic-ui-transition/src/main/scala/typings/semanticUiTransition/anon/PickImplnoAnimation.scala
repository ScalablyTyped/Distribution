package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, 'noAnimation'> */
trait PickImplnoAnimation extends StObject {
  
  var noAnimation: String
}
object PickImplnoAnimation {
  
  inline def apply(noAnimation: String): PickImplnoAnimation = {
    val __obj = js.Dynamic.literal(noAnimation = noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoAnimation]
  }
  
  extension [Self <: PickImplnoAnimation](x: Self) {
    
    inline def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
  }
}
