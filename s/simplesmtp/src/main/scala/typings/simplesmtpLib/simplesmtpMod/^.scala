package typings
package simplesmtpLib.simplesmtpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesmtp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSimpleServer(): simplesmtpLib.simplesmtpMod.SimpleServer = js.native
  def createSimpleServer(
    callback: js.Function1[/* connection */ simplesmtpLib.simplesmtpMod.SimpleServerConnection, scala.Unit]
  ): simplesmtpLib.simplesmtpMod.SimpleServer = js.native
  def createSimpleServer(options: simplesmtpLib.simplesmtpMod.SmtpServerOptions): simplesmtpLib.simplesmtpMod.SimpleServer = js.native
  def createSimpleServer(
    options: simplesmtpLib.simplesmtpMod.SmtpServerOptions,
    callback: js.Function1[/* connection */ simplesmtpLib.simplesmtpMod.SimpleServerConnection, scala.Unit]
  ): simplesmtpLib.simplesmtpMod.SimpleServer = js.native
}

