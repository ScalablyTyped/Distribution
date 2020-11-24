package typings.simplesmtp.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplesmtp", "SimpleServer")
@js.native
class SimpleServer () extends EventEmitter {
  def this(callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
  def this(options: SmtpServerOptions) = this()
  def this(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* connection */ SimpleServerConnection, Unit]
  ) = this()
  def this(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
  
  /**
    * Server starts listening on defined port and hostname
    *
    * @param {Number} port The port number to listen
    * @param {String} [host] The hostname to listen
    * @param {Function} callback The callback function to run when the server is listening
    */
  def listen(port: Double, host: String): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  var server: SMTPServer = js.native
}
