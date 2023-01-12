package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var error: RTCError
}
object RTCErrorEventInit {
  
  inline def apply(error: RTCError): RTCErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCErrorEventInit] (val x: Self) extends AnyVal {
    
    inline def setError(value: RTCError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
