package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListenerObject extends StObject {
  
  def handleEvent(evt: Event): Unit
}
object EventListenerObject {
  
  @scala.inline
  def apply(handleEvent: Event => Unit): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  @scala.inline
  implicit class EventListenerObjectMutableBuilder[Self <: EventListenerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleEvent(value: Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
