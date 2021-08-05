package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCSrtpSdesTransportEventMap extends StObject {
  
  var error: Event
}
object RTCSrtpSdesTransportEventMap {
  
  inline def apply(error: Event): RTCSrtpSdesTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesTransportEventMap]
  }
  
  extension [Self <: RTCSrtpSdesTransportEventMap](x: Self) {
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
