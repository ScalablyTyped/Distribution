package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failed extends StObject {
  
  var failed: Boolean
  
  var success: Unit
}
object Failed {
  
  inline def apply(failed: Boolean, success: Unit): Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Failed] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Unit): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
