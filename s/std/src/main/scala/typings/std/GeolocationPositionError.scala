package typings.std

import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError) */
trait GeolocationPositionError extends StObject {
  
  /* standard dom */
  val PERMISSION_DENIED: `1`
  
  /* standard dom */
  val POSITION_UNAVAILABLE: `2`
  
  /* standard dom */
  val TIMEOUT: `3`
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/code) */
  /* standard dom */
  val code: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPositionError/message) */
  /* standard dom */
  val message: java.lang.String
}
object GeolocationPositionError {
  
  inline def apply(code: Double, message: java.lang.String): GeolocationPositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = 1, POSITION_UNAVAILABLE = 2, TIMEOUT = 3, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPositionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationPositionError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPERMISSION_DENIED(value: `1`): Self = StObject.set(x, "PERMISSION_DENIED", value.asInstanceOf[js.Any])
    
    inline def setPOSITION_UNAVAILABLE(value: `2`): Self = StObject.set(x, "POSITION_UNAVAILABLE", value.asInstanceOf[js.Any])
    
    inline def setTIMEOUT(value: `3`): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
  }
}
