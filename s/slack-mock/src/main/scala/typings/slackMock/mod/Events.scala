package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events[T] extends StObject {
  
  var calls: js.Array[EventCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: EventUrl, body: T): js.Promise[Unit]
}
object Events {
  
  inline def apply[T](calls: js.Array[EventCall[T]], reset: () => Unit, send: (EventUrl, T) => js.Promise[Unit]): Events[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Events[T]]
  }
  
  extension [Self <: Events[?], T](x: Self & Events[T]) {
    
    inline def setCalls(value: js.Array[EventCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: EventCall[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSend(value: (EventUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
