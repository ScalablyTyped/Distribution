package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ state in sharedb.sharedb/lib/sharedb.ConnectionState ]: (reason : string): void} */
trait ConnectionStateEventMap extends StObject {
  
  def closed(reason: String): Unit
  @JSName("closed")
  var closed_Original: js.Function1[/* reason */ String, Unit]
  
  def connected(reason: String): Unit
  @JSName("connected")
  var connected_Original: js.Function1[/* reason */ String, Unit]
  
  def connecting(reason: String): Unit
  @JSName("connecting")
  var connecting_Original: js.Function1[/* reason */ String, Unit]
  
  def disconnected(reason: String): Unit
  @JSName("disconnected")
  var disconnected_Original: js.Function1[/* reason */ String, Unit]
  
  def stopped(reason: String): Unit
  @JSName("stopped")
  var stopped_Original: js.Function1[/* reason */ String, Unit]
}
object ConnectionStateEventMap {
  
  inline def apply(
    closed: /* reason */ String => Unit,
    connected: /* reason */ String => Unit,
    connecting: /* reason */ String => Unit,
    disconnected: /* reason */ String => Unit,
    stopped: /* reason */ String => Unit
  ): ConnectionStateEventMap = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), connecting = js.Any.fromFunction1(connecting), disconnected = js.Any.fromFunction1(disconnected), stopped = js.Any.fromFunction1(stopped))
    __obj.asInstanceOf[ConnectionStateEventMap]
  }
  
  extension [Self <: ConnectionStateEventMap](x: Self) {
    
    inline def setClosed(value: /* reason */ String => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    inline def setConnected(value: /* reason */ String => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
    
    inline def setConnecting(value: /* reason */ String => Unit): Self = StObject.set(x, "connecting", js.Any.fromFunction1(value))
    
    inline def setDisconnected(value: /* reason */ String => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    
    inline def setStopped(value: /* reason */ String => Unit): Self = StObject.set(x, "stopped", js.Any.fromFunction1(value))
  }
}
