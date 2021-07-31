package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCErrorEventInit
  extends StObject
     with EventInit {
  
  var error: RTCError
}
object RTCErrorEventInit {
  
  @scala.inline
  def apply(error: RTCError): RTCErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorEventInit]
  }
  
  @scala.inline
  implicit class RTCErrorEventInitMutableBuilder[Self <: RTCErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: RTCError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
