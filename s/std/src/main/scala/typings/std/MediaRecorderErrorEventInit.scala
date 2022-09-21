package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var error: DOMException
}
object MediaRecorderErrorEventInit {
  
  inline def apply(error: DOMException): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
  
  extension [Self <: MediaRecorderErrorEventInit](x: Self) {
    
    inline def setError(value: DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
