package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamErrorEventInit
  extends StObject
     with EventInit {
  
  var error: js.UndefOr[MediaStreamError | Null] = js.undefined
}
object MediaStreamErrorEventInit {
  
  inline def apply(): MediaStreamErrorEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamErrorEventInit]
  }
  
  extension [Self <: MediaStreamErrorEventInit](x: Self) {
    
    inline def setError(value: MediaStreamError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
