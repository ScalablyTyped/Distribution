package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationPositionError extends StObject {
  
  /* standard dom */
  val PERMISSION_DENIED: Double
  
  /* standard dom */
  val POSITION_UNAVAILABLE: Double
  
  /* standard dom */
  val TIMEOUT: Double
  
  /* standard dom */
  val code: Double
  
  /* standard dom */
  val message: java.lang.String
}
object GeolocationPositionError {
  
  inline def apply(
    PERMISSION_DENIED: Double,
    POSITION_UNAVAILABLE: Double,
    TIMEOUT: Double,
    code: Double,
    message: java.lang.String
  ): GeolocationPositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED.asInstanceOf[js.Any], POSITION_UNAVAILABLE = POSITION_UNAVAILABLE.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPositionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationPositionError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPERMISSION_DENIED(value: Double): Self = StObject.set(x, "PERMISSION_DENIED", value.asInstanceOf[js.Any])
    
    inline def setPOSITION_UNAVAILABLE(value: Double): Self = StObject.set(x, "POSITION_UNAVAILABLE", value.asInstanceOf[js.Any])
    
    inline def setTIMEOUT(value: Double): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
  }
}
