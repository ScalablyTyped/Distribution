package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorNotification extends StObject {
  
  var error: Any
  
  /** The kind of notification. Always "E" */
  var kind: "E"
}
object ErrorNotification {
  
  inline def apply(error: Any): ErrorNotification = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "E")
    __obj.asInstanceOf[ErrorNotification]
  }
  
  extension [Self <: ErrorNotification](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "E"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
