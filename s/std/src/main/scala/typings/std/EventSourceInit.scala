package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceInit extends StObject {
  
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}
object EventSourceInit {
  
  @scala.inline
  def apply(): EventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceInit]
  }
  
  @scala.inline
  implicit class EventSourceInitMutableBuilder[Self <: EventSourceInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithCredentials(value: scala.Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
