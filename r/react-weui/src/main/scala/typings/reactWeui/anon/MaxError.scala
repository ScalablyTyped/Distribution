package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxError extends StObject {
  
  var maxError: js.Any = js.native
}
object MaxError {
  
  @scala.inline
  def apply(maxError: js.Any): MaxError = {
    val __obj = js.Dynamic.literal(maxError = maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxError]
  }
  
  @scala.inline
  implicit class MaxErrorMutableBuilder[Self <: MaxError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxError(value: js.Any): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
  }
}
