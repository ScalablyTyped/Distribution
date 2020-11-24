package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationError extends js.Object {
  
  /**
    * Reason of an error occurring when using the geolocating device.
    *
    * Possible error codes:
    *  1. PERMISSION_DENIED
    *  2. LOCATION_UNAVAILABLE
    *  3. TIMEOUT
    */
  var code: LocationErrorCode = js.native
  
  /** Message describing the details of the error */
  var message: String = js.native
}
object LocationError {
  
  @scala.inline
  def apply(code: LocationErrorCode, message: String): LocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationError]
  }
  
  @scala.inline
  implicit class LocationErrorOps[Self <: LocationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: LocationErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
