package typings.sharepoint.SPNs

import typings.microsoftDashAjax.SysNs.EventArgs
import typings.microsoftDashAjax.SysNs.NetNs.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebRequestEventArgs")
@js.native
class WebRequestEventArgs protected () extends EventArgs {
  def this(webRequest: WebRequest) = this()
  def get_webRequest(): WebRequest = js.native
}

