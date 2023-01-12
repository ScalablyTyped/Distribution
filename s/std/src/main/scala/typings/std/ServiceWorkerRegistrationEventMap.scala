package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistrationEventMap extends StObject {
  
  /* standard dom */
  var updatefound: Event
}
object ServiceWorkerRegistrationEventMap {
  
  inline def apply(updatefound: Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkerRegistrationEventMap] (val x: Self) extends AnyVal {
    
    inline def setUpdatefound(value: Event): Self = StObject.set(x, "updatefound", value.asInstanceOf[js.Any])
  }
}
