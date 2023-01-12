package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined sharedb.sharedb/lib/sharedb.ConnectionStateEventMap & {connection error (error : sharedb.sharedb/lib/sharedb.Error): void, doc (doc : sharedb.sharedb/lib/sharedb.Doc<any>): void, error (error : sharedb.sharedb/lib/sharedb.Error): void, pong (): void, receive (request : sharedb.sharedb/lib/sharedb.ConnectionReceiveRequest): void, send (message : any): void, state (newState : sharedb.sharedb/lib/sharedb.ConnectionState, reason : string): void} */
trait ConnectionEventMap extends StObject {
  
  def closed(reason: String): Unit
  @JSName("closed")
  var closed_Original: js.Function1[/* reason */ String, Unit]
  
  def connected(reason: String): Unit
  @JSName("connected")
  var connected_Original: js.Function1[/* reason */ String, Unit]
  
  def connecting(reason: String): Unit
  @JSName("connecting")
  var connecting_Original: js.Function1[/* reason */ String, Unit]
  
  def `connection error`(error: Error): Unit
  
  def disconnected(reason: String): Unit
  @JSName("disconnected")
  var disconnected_Original: js.Function1[/* reason */ String, Unit]
  
  def doc(doc: Doc[Any]): Unit
  
  def error(error: Error): Unit
  
  def pong(): Unit
  
  def receive(request: ConnectionReceiveRequest): Unit
  
  def send(message: Any): Unit
  
  def state(newState: ConnectionState, reason: String): Unit
  
  def stopped(reason: String): Unit
  @JSName("stopped")
  var stopped_Original: js.Function1[/* reason */ String, Unit]
}
object ConnectionEventMap {
  
  inline def apply(
    closed: /* reason */ String => Unit,
    connected: /* reason */ String => Unit,
    connecting: /* reason */ String => Unit,
    `connection error`: Error => Unit,
    disconnected: /* reason */ String => Unit,
    doc: Doc[Any] => Unit,
    error: Error => Unit,
    pong: () => Unit,
    receive: ConnectionReceiveRequest => Unit,
    send: Any => Unit,
    state: (ConnectionState, String) => Unit,
    stopped: /* reason */ String => Unit
  ): ConnectionEventMap = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), connecting = js.Any.fromFunction1(connecting), disconnected = js.Any.fromFunction1(disconnected), doc = js.Any.fromFunction1(doc), error = js.Any.fromFunction1(error), pong = js.Any.fromFunction0(pong), receive = js.Any.fromFunction1(receive), send = js.Any.fromFunction1(send), state = js.Any.fromFunction2(state), stopped = js.Any.fromFunction1(stopped))
    __obj.updateDynamic("connection error")(js.Any.fromFunction1(`connection error`))
    __obj.asInstanceOf[ConnectionEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionEventMap] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: /* reason */ String => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    inline def setConnected(value: /* reason */ String => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    
    inline def setConnecting(value: /* reason */ String => Unit): Self = StObject.set(x, "connecting", js.Any.fromFunction1(value))
    
    inline def `setConnection error`(value: Error => Unit): Self = StObject.set(x, "connection error", js.Any.fromFunction1(value))
    
    inline def setDisconnected(value: /* reason */ String => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    
    inline def setDoc(value: Doc[Any] => Unit): Self = StObject.set(x, "doc", js.Any.fromFunction1(value))
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setPong(value: () => Unit): Self = StObject.set(x, "pong", js.Any.fromFunction0(value))
    
    inline def setReceive(value: ConnectionReceiveRequest => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction1(value))
    
    inline def setSend(value: Any => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setState(value: (ConnectionState, String) => Unit): Self = StObject.set(x, "state", js.Any.fromFunction2(value))
    
    inline def setStopped(value: /* reason */ String => Unit): Self = StObject.set(x, "stopped", js.Any.fromFunction1(value))
  }
}
