package typings.simplesmtp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simplesmtp", "createSimpleServer")
@js.native
object createSimpleServer extends js.Object {
  
  def apply(): SimpleServer = js.native
  def apply(callback: js.Function1[/* connection */ SimpleServerConnection, Unit]): SimpleServer = js.native
  def apply(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* connection */ SimpleServerConnection, Unit]
  ): SimpleServer = js.native
  def apply(options: SmtpServerOptions): SimpleServer = js.native
  def apply(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]): SimpleServer = js.native
}
