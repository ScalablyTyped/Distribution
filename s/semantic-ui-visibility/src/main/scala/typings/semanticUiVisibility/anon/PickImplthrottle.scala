package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'throttle'> */
trait PickImplthrottle extends StObject {
  
  var throttle: `false` | Double
}
object PickImplthrottle {
  
  inline def apply(throttle: `false` | Double): PickImplthrottle = {
    val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplthrottle]
  }
  
  extension [Self <: PickImplthrottle](x: Self) {
    
    inline def setThrottle(value: `false` | Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
  }
}
