package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveButtons[T] extends StObject {
  
  def addResponse(opts: InteractiveButtonOptions[T]): Unit
  
  var calls: js.Array[InteractiveButtonCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: InteractiveButtonUrl, body: T): js.Promise[Unit]
}
object InteractiveButtons {
  
  inline def apply[T](
    addResponse: InteractiveButtonOptions[T] => Unit,
    calls: js.Array[InteractiveButtonCall[T]],
    reset: () => Unit,
    send: (InteractiveButtonUrl, T) => js.Promise[Unit]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
  
  extension [Self <: InteractiveButtons[?], T](x: Self & InteractiveButtons[T]) {
    
    inline def setAddResponse(value: InteractiveButtonOptions[T] => Unit): Self = StObject.set(x, "addResponse", js.Any.fromFunction1(value))
    
    inline def setCalls(value: js.Array[InteractiveButtonCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: InteractiveButtonCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSend(value: (InteractiveButtonUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
