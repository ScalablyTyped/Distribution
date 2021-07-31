package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBRequestEventMap extends StObject {
  
  var error: Event
  
  var success: Event
}
object IDBRequestEventMap {
  
  @scala.inline
  def apply(error: Event, success: Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
  
  @scala.inline
  implicit class IDBRequestEventMapMutableBuilder[Self <: IDBRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Event): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
