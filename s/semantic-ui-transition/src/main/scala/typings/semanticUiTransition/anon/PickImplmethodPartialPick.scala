package typings.semanticUiTransition.anon

import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl>> */
trait PickImplmethodPartialPick
  extends StObject
     with Param {
  
  var method: String
  
  var noAnimation: js.UndefOr[String] = js.undefined
}
object PickImplmethodPartialPick {
  
  inline def apply(method: String): PickImplmethodPartialPick = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethodPartialPick]
  }
  
  extension [Self <: PickImplmethodPartialPick](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
    
    inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
  }
}
