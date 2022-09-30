package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an active connection to a remote machine over the TCP protocol.
  */
@js.native
trait Socket extends StObject {
  
  /**
    * Read data from the socket in the background. The promise resolves once the requested number
    * of bytes has been read.
    * @param numBytes Number of bytes to read from the socket.
    * @returns A promise for an `ArrayBuffer` containing the data received.
    * @throws Rejects with `Error` if the connection is lost before all bytes can be read.
    */
  def asyncRead(numBytes: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Write data to the socket in the background. The promise resolves once all the data has been
    * transmitted.
    * @param data A buffer object containing the data to write.
    * @throws Rejects with `Error` if the connection is lost before all bytes can be transmitted.
    */
  def asyncWrite(data: js.typedarray.ArrayBuffer): js.Promise[Unit] = js.native
  def asyncWrite(data: js.typedarray.ArrayBufferView): js.Promise[Unit] = js.native
  
  /** Number of bytes available for immediate reading from this socket. */
  val bytesAvailable: Double = js.native
  
  /** Number of bytes written to this socket but not yet sent over the network. */
  val bytesPending: Double = js.native
  
  /** Total number of bytes received since this socket was connected. */
  val bytesReceived: Double = js.native
  
  /** Total number of bytes sent over the network through this socket since it was connected. */
  val bytesSent: Double = js.native
  
  /**
    * Shut down the connection. If data remains in this socket's write buffer, it will be sent over
    * the network before disconnecting. The promise resolves once the socket is fully disconnected.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Start trying to connect this socket in the background. The promise resolves once the
    * connection is established.
    * @param hostName The name or IP address of the remote machine to connect to.
    * @param port     TCP port to connect on. The host must be listening on this port.
    * @throws Rejects with `Error` if the connection fails.
    */
  def connectTo(hostName: String, port: Double): js.Promise[Unit] = js.native
  
  /** `true` if the socket is fully connected, otherwise `false`. */
  val connected: Boolean = js.native
  
  /**
    * Immediately disconnect this socket. Any data remaining in the write-behind buffer will be
    * discarded without being sent over the network.
    */
  def disconnect(): Unit = js.native
  
  /**
    * Whether Nagle's algorithm is **disabled** for this socket. Setting this to `true` can reduce
    * latency for small writes but might increase overhead and lead to network congestion. Unless
    * you understand exactly what this does, it is recommended to leave it alone.
    * @default false
    */
  var noDelay: Boolean = js.native
  
  /**
    * Peek at the next `numBytes` in the socket's receive buffer without removing that data from
    * the buffer.
    * @param numBytes Number of bytes to read ahead.
    * @throws `RangeError` if there is less data in the receive buffer than requested.
    */
  def peek(numBytes: Double): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Read the next `numBytes` from this socket's receive buffer. There must be at least that much
    * data available for immediate reading (see `bytesAvailable`).
    * @param numBytes Number of bytes of data to read.
    */
  def read(numBytes: Double): js.typedarray.ArrayBuffer = js.native
  
  /** Name or IP address of the remote machine this socket is connected to. */
  val remoteAddress: String = js.native
  
  /**
    * The port number the remote machine is using to send data. This will be different from the
    * port used to make the connection and is generally only useful for diagnostic purposes.
    */
  val remotePort: Double = js.native
  
  /**
    * Write data to this socket. The data can be read on the other side of the connection.
    * @param data A buffer object containing the data to write.
    */
  def write(data: js.typedarray.ArrayBuffer): Unit = js.native
  def write(data: js.typedarray.ArrayBufferView): Unit = js.native
}
