package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a TCP server that listens for incoming TCP connections on a specific port.
  */
trait Server extends StObject {
  
  /**
    * Accept a pending incoming connection and create a new `Socket` for it.
    * @returns A `Socket` for the newly completed connection.
    * @throws A `RangeError` is thrown if there are no pending connections.
    */
  def accept(): Socket
  
  /**
    * Get a promise for the `Socket` of the next incoming connection, whenever one is available.
    * @returns A promise for the next connection's `Socket`.
    */
  def acceptNext(): js.Promise[Socket]
  
  /**
    * Shut down the server. Incoming connections that haven't yet been accepted will be dropped.
    */
  def close(): Unit
  
  /**
    * Boolean value specifying whether Nagle's algorithm (write coalescing) should be **disabled**
    * for sockets spawned by this server.
    * @default false
    */
  var noDelay: Boolean
  
  /**
    * Number of incoming connections still waiting to be accepted.
    */
  var numPending: Double
}
object Server {
  
  inline def apply(
    accept: () => Socket,
    acceptNext: () => js.Promise[Socket],
    close: () => Unit,
    noDelay: Boolean,
    numPending: Double
  ): Server = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), acceptNext = js.Any.fromFunction0(acceptNext), close = js.Any.fromFunction0(close), noDelay = noDelay.asInstanceOf[js.Any], numPending = numPending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setAccept(value: () => Socket): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    inline def setAcceptNext(value: () => js.Promise[Socket]): Self = StObject.set(x, "acceptNext", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNumPending(value: Double): Self = StObject.set(x, "numPending", value.asInstanceOf[js.Any])
  }
}
