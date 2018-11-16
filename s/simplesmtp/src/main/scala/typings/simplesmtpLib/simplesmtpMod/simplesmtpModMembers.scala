package typings
package simplesmtpLib.simplesmtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesmtp", JSImport.Namespace)
@js.native
object simplesmtpModMembers extends js.Object {
  def createSimpleServer(): SimpleServer = js.native
  def createSimpleServer(callback: js.Function1[/* connection */ SimpleServerConnection, scala.Unit]): SimpleServer = js.native
  def createSimpleServer(options: SmtpServerOptions): SimpleServer = js.native
  def createSimpleServer(
    options: SmtpServerOptions,
    callback: js.Function1[/* connection */ SimpleServerConnection, scala.Unit]
  ): SimpleServer = js.native
}

