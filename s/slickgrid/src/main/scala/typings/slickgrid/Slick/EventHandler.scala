package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandler[T] extends StObject {
  
  def subscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[Any]
  
  def unsubscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[Any]
  
  def unsubscribeAll(): EventHandler[Any]
}
object EventHandler {
  
  inline def apply[T](
    subscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any],
    unsubscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any],
    unsubscribeAll: () => EventHandler[Any]
  ): EventHandler[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeAll = js.Any.fromFunction0(unsubscribeAll))
    __obj.asInstanceOf[EventHandler[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventHandler[?], T] (val x: Self & EventHandler[T]) extends AnyVal {
    
    inline def setSubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any]): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribeAll(value: () => EventHandler[Any]): Self = StObject.set(x, "unsubscribeAll", js.Any.fromFunction0(value))
  }
}
