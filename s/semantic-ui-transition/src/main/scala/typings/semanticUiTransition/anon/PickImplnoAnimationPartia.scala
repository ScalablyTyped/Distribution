package typings.semanticUiTransition.anon

import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, 'noAnimation'> & std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl>> */
trait PickImplnoAnimationPartia
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noAnimation: String
}
object PickImplnoAnimationPartia {
  
  inline def apply(noAnimation: String): PickImplnoAnimationPartia = {
    val __obj = js.Dynamic.literal(noAnimation = noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoAnimationPartia]
  }
  
  extension [Self <: PickImplnoAnimationPartia](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
  }
}
