package typings.sharepoint.SP.UI

import typings.sharepoint.SPNotifications.EventID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notify {
  
  trait Notification extends StObject {
    
    def Hide(bNoAnimate: Boolean): Unit
    
    def Show(bNoAnimate: Boolean): Unit
    
    def get_id(): String
  }
  object Notification {
    
    inline def apply(Hide: Boolean => Unit, Show: Boolean => Unit, get_id: () => String): Notification = {
      val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), Show = js.Any.fromFunction1(Show), get_id = js.Any.fromFunction0(get_id))
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
      
      inline def setHide(value: Boolean => Unit): Self = StObject.set(x, "Hide", js.Any.fromFunction1(value))
      
      inline def setShow(value: Boolean => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction1(value))
    }
  }
  
  trait NotificationContainer extends StObject {
    
    def Clear(): Unit
    
    def GetCount(): Double
    
    def SetEventHandler(eventId: EventID, eventHandler: js.Any): Unit
  }
  object NotificationContainer {
    
    inline def apply(Clear: () => Unit, GetCount: () => Double, SetEventHandler: (EventID, js.Any) => Unit): NotificationContainer = {
      val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), GetCount = js.Any.fromFunction0(GetCount), SetEventHandler = js.Any.fromFunction2(SetEventHandler))
      __obj.asInstanceOf[NotificationContainer]
    }
    
    extension [Self <: NotificationContainer](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
      
      inline def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
      
      inline def setSetEventHandler(value: (EventID, js.Any) => Unit): Self = StObject.set(x, "SetEventHandler", js.Any.fromFunction2(value))
    }
  }
}
