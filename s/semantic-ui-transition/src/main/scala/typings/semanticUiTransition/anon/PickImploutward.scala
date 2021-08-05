package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'outward'> */
trait PickImploutward extends StObject {
  
  var outward: String
}
object PickImploutward {
  
  inline def apply(outward: String): PickImploutward = {
    val __obj = js.Dynamic.literal(outward = outward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploutward]
  }
  
  extension [Self <: PickImploutward](x: Self) {
    
    inline def setOutward(value: String): Self = StObject.set(x, "outward", value.asInstanceOf[js.Any])
  }
}
