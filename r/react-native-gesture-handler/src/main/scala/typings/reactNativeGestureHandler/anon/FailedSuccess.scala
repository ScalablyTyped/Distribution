package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedSuccess extends StObject {
  
  var failed: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[Boolean] = js.undefined
}
object FailedSuccess {
  
  inline def apply(): FailedSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedSuccess] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
