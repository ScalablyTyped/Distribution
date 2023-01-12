package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalClient extends StObject {
  
  def send(report: SignalReport): js.Promise[Unit]
  
  def sendEvent(event: SignalEvent): js.Promise[Unit]
}
object SignalClient {
  
  inline def apply(send: SignalReport => js.Promise[Unit], sendEvent: SignalEvent => js.Promise[Unit]): SignalClient = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendEvent = js.Any.fromFunction1(sendEvent))
    __obj.asInstanceOf[SignalClient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalClient] (val x: Self) extends AnyVal {
    
    inline def setSend(value: SignalReport => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSendEvent(value: SignalEvent => js.Promise[Unit]): Self = StObject.set(x, "sendEvent", js.Any.fromFunction1(value))
  }
}
