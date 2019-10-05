package typings.sharepoint.SP

import typings.microsoftDashAjax.Sys.EventArgs
import typings.microsoftDashAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebRequestEventArgs")
@js.native
class WebRequestEventArgs protected () extends EventArgs {
  def this(webRequest: WebRequest) = this()
  def get_webRequest(): WebRequest = js.native
}

