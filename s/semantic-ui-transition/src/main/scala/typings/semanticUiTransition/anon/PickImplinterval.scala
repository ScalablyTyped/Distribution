package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'interval'> */
@js.native
trait PickImplinterval extends StObject {
  
  var interval: Double = js.native
}
object PickImplinterval {
  
  @scala.inline
  def apply(interval: Double): PickImplinterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinterval]
  }
  
  @scala.inline
  implicit class PickImplintervalMutableBuilder[Self <: PickImplinterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
