package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxError extends StObject {
  
  var maxError: Any
}
object MaxError {
  
  inline def apply(maxError: Any): MaxError = {
    val __obj = js.Dynamic.literal(maxError = maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxError] (val x: Self) extends AnyVal {
    
    inline def setMaxError(value: Any): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
  }
}
