package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noAnimation: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplMethod {
  
  inline def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  
  extension [Self <: PartialPickImplkeyofImplMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoAnimation(value: String): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
    
    inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
  }
}
