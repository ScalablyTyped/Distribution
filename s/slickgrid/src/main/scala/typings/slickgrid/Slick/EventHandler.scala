package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandler[T] extends StObject {
  
  def subscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[_] = js.native
  
  def unsubscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[_] = js.native
  
  def unsubscribeAll(): EventHandler[_] = js.native
}
object EventHandler {
  
  @scala.inline
  def apply[T](
    subscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_],
    unsubscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_],
    unsubscribeAll: () => EventHandler[_]
  ): EventHandler[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeAll = js.Any.fromFunction0(unsubscribeAll))
    __obj.asInstanceOf[EventHandler[T]]
  }
  
  @scala.inline
  implicit class EventHandlerMutableBuilder[Self <: EventHandler[_], T] (val x: Self with EventHandler[T]) extends AnyVal {
    
    @scala.inline
    def setSubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[_]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribeAll(value: () => EventHandler[_]): Self = StObject.set(x, "unsubscribeAll", js.Any.fromFunction0(value))
  }
}
