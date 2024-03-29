package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBRequestEventMap extends StObject {
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var success: Event
}
object IDBRequestEventMap {
  
  inline def apply(error: Event, success: Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDBRequestEventMap] (val x: Self) extends AnyVal {
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Event): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
