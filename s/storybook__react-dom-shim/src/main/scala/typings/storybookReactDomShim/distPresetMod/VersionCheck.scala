package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionCheck extends StObject {
  
  var cached: Boolean
  
  var data: js.UndefOr[Any] = js.undefined
  
  var error: js.UndefOr[Any] = js.undefined
  
  var success: Boolean
  
  var time: Double
}
object VersionCheck {
  
  inline def apply(cached: Boolean, success: Boolean, time: Double): VersionCheck = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionCheck] (val x: Self) extends AnyVal {
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
