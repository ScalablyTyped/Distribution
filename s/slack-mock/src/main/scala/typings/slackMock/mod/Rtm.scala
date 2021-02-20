package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RTM
@js.native
trait Rtm[T] extends StObject {
  
  var calls: js.Array[RtmCall[T]] = js.native
  
  var clients: js.Array[typings.ws.mod.^] = js.native
  
  def reset(): Unit = js.native
  
  def send(token: String, message: T): js.Promise[Unit] = js.native
  
  def startServer(token: String): Unit = js.native
  
  def stopServer(token: String): Unit = js.native
}
object Rtm {
  
  @scala.inline
  def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[typings.ws.mod.^],
    reset: () => Unit,
    send: (String, T) => js.Promise[Unit],
    startServer: String => Unit,
    stopServer: String => Unit
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send), startServer = js.Any.fromFunction1(startServer), stopServer = js.Any.fromFunction1(stopServer))
    __obj.asInstanceOf[Rtm[T]]
  }
  
  @scala.inline
  implicit class RtmMutableBuilder[Self <: Rtm[_], T] (val x: Self with Rtm[T]) extends AnyVal {
    
    @scala.inline
    def setCalls(value: js.Array[RtmCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsVarargs(value: RtmCall[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setClients(value: js.Array[typings.ws.mod.^]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientsVarargs(value: typings.ws.mod.^ *): Self = StObject.set(x, "clients", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (String, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartServer(value: String => Unit): Self = StObject.set(x, "startServer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopServer(value: String => Unit): Self = StObject.set(x, "stopServer", js.Any.fromFunction1(value))
  }
}
