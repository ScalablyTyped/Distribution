package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxError extends StObject {
  
  var maxError: js.Any
}
object MaxError {
  
  inline def apply(maxError: js.Any): MaxError = {
    val __obj = js.Dynamic.literal(maxError = maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxError]
  }
  
  extension [Self <: MaxError](x: Self) {
    
    inline def setMaxError(value: js.Any): Self = StObject.set(x, "maxError", value.asInstanceOf[js.Any])
  }
}
