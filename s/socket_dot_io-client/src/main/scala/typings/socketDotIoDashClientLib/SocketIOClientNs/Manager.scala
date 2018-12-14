package typings
package socketDotIoDashClientLib.SocketIOClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Manager class handles all the Namespaces and Sockets that we're using
	 */
@js.native
trait Manager extends Emitter {
  /**
  		 * If we should auto connect (also used when creating Sockets). Set via the
  		 * opts object
  		 */
  var autoConnect: scala.Boolean = js.native
  /**
  		 * The currently connected sockets
  		 */
  var connecting: js.Array[Socket] = js.native
  /**
  		 * All the namespaces currently controlled by this Manager, and the Sockets
  		 * that we're using to communicate with them
  		 */
  var nsps: org.scalablytyped.runtime.StringDictionary[Socket] = js.native
  /**
  		 * The connect options that we used when creating this Manager
  		 */
  var opts: ConnectOpts = js.native
  /**
  		 * The state of the Manager. Either 'closed', 'opening', or 'open'
  		 */
  var readyState: java.lang.String = js.native
  /**
  		 * The URI that this manager is for (host + port), e.g. 'http://localhost:4000'
  		 */
  var uri: java.lang.String = js.native
  /**
  		 * @see open( fn );
  		 */
  def connect(): Manager = js.native
  /**
  		 * @see open( fn );
  		 */
  def connect(fn: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): Manager = js.native
  /**
  		 * Sets the current transport socket and opens our connection
  		 * @param fn An optional callback to call when our socket has either opened, or
  		 * failed. It can take one optional parameter of type Error
  		 * @return This Manager
  		 */
  def open(): Manager = js.native
  /**
  		 * Sets the current transport socket and opens our connection
  		 * @param fn An optional callback to call when our socket has either opened, or
  		 * failed. It can take one optional parameter of type Error
  		 * @return This Manager
  		 */
  def open(fn: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): Manager = js.native
  /**
  		 * Gets the randomisation factor used in the exponential backoff jitter
  		 * when reconnecting
  		 * @default 0.5
  		 */
  def randomizationFactor(): scala.Double = js.native
  /**
  		 * Sets the randomisation factor used in the exponential backoff jitter
  		 * when reconnecting
  		 * @param The reconnection randomisation factor
  		 * @default 0.5
  		 * @return This Manager
  		 */
  def randomizationFactor(v: scala.Double): Manager = js.native
  /**
  		 * Gets if we should reconnect automatically
  		 * @default true
  		 */
  def reconnection(): scala.Boolean = js.native
  /**
  		 * Sets if we should reconnect automatically
  		 * @param v True if we should reconnect automatically, false otherwise
  		 * @default true
  		 * @return This Manager
  		 */
  def reconnection(v: scala.Boolean): Manager = js.native
  /**
  		 * Gets the number of reconnection attempts we should try before giving up
  		 * @default Infinity
  		 */
  def reconnectionAttempts(): scala.Double = js.native
  /**
  		 * Sets the number of reconnection attempts we should try before giving up
  		 * @param v The number of attempts we should do before giving up
  		 * @default Infinity
  		 * @return This Manager
  		 */
  def reconnectionAttempts(v: scala.Double): Manager = js.native
  /**
  		 * Gets the delay in milliseconds between each reconnection attempt
  		 * @default 1000
  		 */
  def reconnectionDelay(): scala.Double = js.native
  /**
  		 * Sets the delay in milliseconds between each reconnection attempt
  		 * @param v The delay in milliseconds
  		 * @default 1000
  		 * @return This Manager
  		 */
  def reconnectionDelay(v: scala.Double): Manager = js.native
  /**
  		 * Gets the max reconnection delay in milliseconds between each reconnection
  		 * attempt
  		 * @default 5000
  		 */
  def reconnectionDelayMax(): scala.Double = js.native
  /**
  		 * Sets the max reconnection delay in milliseconds between each reconnection
  		 * attempt
  		 * @param v The max reconnection dleay in milliseconds
  		 * @return This Manager
  		 */
  def reconnectionDelayMax(v: scala.Double): Manager = js.native
  /**
  		 * Creates a new Socket for the given namespace
  		 * @param nsp The namespace that this Socket is for
  		 * @return A new Socket, or if one has already been created for this namespace,
  		 * an existing one
  		 */
  def socket(nsp: java.lang.String): Socket = js.native
  /**
  		 * Gets the timeout in milliseconds for our connection attempts
  		 * @default 20000
  		 */
  def timeout(): scala.Double = js.native
  /**
  		 * Sets the timeout in milliseconds for our connection attempts
  		 * @param The connection timeout milliseconds
  		 * @return This Manager
  		 */
  def timeout(v: scala.Double): Manager = js.native
}

