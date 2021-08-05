package typings.semanticUiTransition.anon

import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'reverse'> */
trait PickImplreverse extends StObject {
  
  var reverse: auto | Boolean
}
object PickImplreverse {
  
  inline def apply(reverse: auto | Boolean): PickImplreverse = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreverse]
  }
  
  extension [Self <: PickImplreverse](x: Self) {
    
    inline def setReverse(value: auto | Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
  }
}
