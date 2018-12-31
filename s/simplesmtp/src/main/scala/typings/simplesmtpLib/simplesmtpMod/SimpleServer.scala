package typings
package simplesmtpLib.simplesmtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesmtp", "SimpleServer")
@js.native
class SimpleServer ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(callback: js.Function1[/* connection */ SimpleServerConnection, scala.Unit]) = this()
  def this(options: SmtpServerOptions) = this()
  def this(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, scala.Unit]) = this()
  var server: SMTPServer = js.native
  /**
  	 * Server starts listening on defined port and hostname
  	 *
  	 * @param {Number} port The port number to listen
  	 * @param {String} [host] The hostname to listen
  	 * @param {Function} callback The callback function to run when the server is listening
  	 */
  def listen(port: scala.Double, host: java.lang.String): scala.Unit = js.native
  def listen(
    port: scala.Double,
    host: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

