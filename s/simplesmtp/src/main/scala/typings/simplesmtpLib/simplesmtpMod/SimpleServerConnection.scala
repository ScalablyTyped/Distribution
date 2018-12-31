package typings
package simplesmtpLib.simplesmtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleServerConnection
  extends nodeLib.NodeJSNs.ReadableStream {
  /**
  	 * From address
  	 */
  var from: java.lang.String = js.native
  /**
  	 * hostname reported by the client
  	 */
  var host: java.lang.String = js.native
  /**
  	 * client IP address
  	 */
  var remoteAddress: java.lang.String = js.native
  /**
  	 * an array of To addresses
  	 */
  var to: js.Array[java.lang.String] = js.native
  /**
  	 * Accept the message with the selected ID
  	 */
  def accept(): scala.Unit = js.native
  def accept(id: java.lang.String): scala.Unit = js.native
  /**
  	 * Reject the message with the selected message
  	 */
  def reject(): scala.Unit = js.native
  def reject(reason: java.lang.String): scala.Unit = js.native
}

