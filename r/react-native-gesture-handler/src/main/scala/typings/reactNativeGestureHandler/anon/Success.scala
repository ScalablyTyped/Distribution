package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var failed: Unit
  
  var success: Boolean
}
object Success {
  
  inline def apply(failed: Unit, success: Boolean): Success = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: Unit): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
