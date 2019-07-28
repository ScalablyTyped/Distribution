package typings.sharepoint.SPNs

import typings.microsoftDashAjax.SysNs.EventArgs
import typings.microsoftDashAjax.SysNs.NetNs.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestFailedEventArgs")
@js.native
class PageRequestFailedEventArgs () extends EventArgs {
  def get_errorMessage(): String = js.native
  def get_executor(): WebRequestExecutor = js.native
  def get_isErrorPage(): Boolean = js.native
}

