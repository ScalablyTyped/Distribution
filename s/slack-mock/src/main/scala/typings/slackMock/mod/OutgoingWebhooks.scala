package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingWebhooks[T] extends StObject {
  
  var calls: js.Array[OutgoingWebhookCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit]
}
object OutgoingWebhooks {
  
  inline def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: () => Unit,
    send: (OutgoingWebhookUrl, T) => js.Promise[Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutgoingWebhooks[?], T] (val x: Self & OutgoingWebhooks[T]) extends AnyVal {
    
    inline def setCalls(value: js.Array[OutgoingWebhookCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: OutgoingWebhookCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSend(value: (OutgoingWebhookUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
