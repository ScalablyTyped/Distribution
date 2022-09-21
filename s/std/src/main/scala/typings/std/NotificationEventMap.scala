package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventMap extends StObject {
  
  /* standard dom */
  var click: Event
  
  /* standard dom */
  var close: Event
  
  /* standard dom */
  var error: Event
  
  /* standard dom */
  var show: Event
}
object NotificationEventMap {
  
  inline def apply(click: Event, close: Event, error: Event, show: Event): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
  
  extension [Self <: NotificationEventMap](x: Self) {
    
    inline def setClick(value: Event): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Event): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
