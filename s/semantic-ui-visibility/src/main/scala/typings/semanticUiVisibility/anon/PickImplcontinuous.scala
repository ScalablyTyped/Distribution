package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'continuous'> */
trait PickImplcontinuous extends StObject {
  
  var continuous: Boolean
}
object PickImplcontinuous {
  
  inline def apply(continuous: Boolean): PickImplcontinuous = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontinuous]
  }
  
  extension [Self <: PickImplcontinuous](x: Self) {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
  }
}
