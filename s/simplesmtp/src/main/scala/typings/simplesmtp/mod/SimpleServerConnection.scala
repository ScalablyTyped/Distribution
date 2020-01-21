package typings.simplesmtp.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleServerConnection extends ReadableStream {
  /**
  	 * From address
  	 */
  var from: String = js.native
  /**
  	 * hostname reported by the client
  	 */
  var host: String = js.native
  /**
  	 * client IP address
  	 */
  var remoteAddress: String = js.native
  /**
  	 * an array of To addresses
  	 */
  var to: js.Array[String] = js.native
  /**
  	 * Accept the message with the selected ID
  	 */
  def accept(): Unit = js.native
  def accept(id: String): Unit = js.native
  /**
  	 * Reject the message with the selected message
  	 */
  def reject(): Unit = js.native
  def reject(reason: String): Unit = js.native
}

