package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventMap extends StObject {
  
  var click: Event = js.native
  
  var close: Event = js.native
  
  var error: Event = js.native
  
  var show: Event = js.native
}
object NotificationEventMap {
  
  @scala.inline
  def apply(click: Event, close: Event, error: Event, show: Event): NotificationEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMap]
  }
  
  @scala.inline
  implicit class NotificationEventMapMutableBuilder[Self <: NotificationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: Event): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Event): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
