package typings.socketDotIoDashClient.SocketIOClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Socket that we use to connect to a Namespace on the server
	 */
@js.native
trait Socket extends Emitter {
  /**
  		 * Are we currently connected?
  		 * @default false
  		 */
  var connected: Boolean = js.native
  /**
  		 * Are we currently disconnected?
  		 * @default true
  		 */
  var disconnected: Boolean = js.native
  /**
  		 * The ID of the socket; matches the server ID and is set when we're connected, and cleared
  		 * when we're disconnected
  		 */
  var id: String = js.native
  /**
  		 * The Manager that's controller this socket
  		 */
  var io: Manager = js.native
  /**
  		 * The namespace that this socket is for
  		 * @default '/'
  		 */
  var nsp: String = js.native
  /**
  		 * Disconnects the socket manually
  		 * @return This Socket
  		 */
  def close(): Socket = js.native
  /**
  		* Sets the compress flag.
  		* @param compress If `true`, compresses the sending data
  		* @return this Socket
  		*/
  def compress(compress: Boolean): Socket = js.native
  /**
  		 * @see open();
  		 */
  def connect(): Socket = js.native
  /**
  		 * @see close()
  		 */
  def disconnect(): Socket = js.native
  /**
  		 * Opens our socket so that it connects. If the 'autoConnect' option for io is
  		 * true (default), then this is called automatically when the Socket is created
  		 */
  def open(): Socket = js.native
  /**
  		 * Sends a 'message' event
  		 * @param args Any optional arguments that we want to send
  		 * @see emit
  		 * @return This Socket
  		 */
  def send(args: js.Any*): Socket = js.native
}

