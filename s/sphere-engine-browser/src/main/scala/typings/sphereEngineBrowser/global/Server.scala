package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a TCP server that listens for incoming TCP connections on a specific port.
  */
@JSGlobal("Server")
@js.native
open class Server protected ()
  extends StObject
     with typings.sphereEngineBrowser.Server {
  /**
    * Initialize a TCP server that listens for incoming connections on a given port.
    * @param port        TCP port number on which to run the server.
    * @param backlogSize Maximum number of incoming connections that can remain unaccepted before
    *                    new connections are refused.
    */
  def this(port: Double) = this()
  def this(port: Double, backlogSize: Double) = this()
  
  /**
    * Accept a pending incoming connection and create a new `Socket` for it.
    * @returns A `Socket` for the newly completed connection.
    * @throws A `RangeError` is thrown if there are no pending connections.
    */
  /* CompleteClass */
  override def accept(): typings.sphereEngineBrowser.Socket = js.native
  
  /**
    * Get a promise for the `Socket` of the next incoming connection, whenever one is available.
    * @returns A promise for the next connection's `Socket`.
    */
  /* CompleteClass */
  override def acceptNext(): js.Promise[typings.sphereEngineBrowser.Socket] = js.native
  
  /**
    * Shut down the server. Incoming connections that haven't yet been accepted will be dropped.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Boolean value specifying whether Nagle's algorithm (write coalescing) should be **disabled**
    * for sockets spawned by this server.
    * @default false
    */
  /* CompleteClass */
  var noDelay: Boolean = js.native
  
  /**
    * Number of incoming connections still waiting to be accepted.
    */
  /* CompleteClass */
  var numPending: Double = js.native
}
