package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'throttle'> */
@js.native
trait PickImplthrottle extends StObject {
  
  var throttle: Double = js.native
}
object PickImplthrottle {
  
  @scala.inline
  def apply(throttle: Double): PickImplthrottle = {
    val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplthrottle]
  }
  
  @scala.inline
  implicit class PickImplthrottleMutableBuilder[Self <: PickImplthrottle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
  }
}
