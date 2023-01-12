package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingWebhooks[T] extends StObject {
  
  def addResponse(opts: IncomingWebhookOptions[T]): Unit
  
  var calls: js.Array[IncomingWebhookCall[T]]
  
  def reset(): Unit
}
object IncomingWebhooks {
  
  inline def apply[T](
    addResponse: IncomingWebhookOptions[T] => Unit,
    calls: js.Array[IncomingWebhookCall[T]],
    reset: () => Unit
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncomingWebhooks[?], T] (val x: Self & IncomingWebhooks[T]) extends AnyVal {
    
    inline def setAddResponse(value: IncomingWebhookOptions[T] => Unit): Self = StObject.set(x, "addResponse", js.Any.fromFunction1(value))
    
    inline def setCalls(value: js.Array[IncomingWebhookCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: IncomingWebhookCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
