package typings.sharepoint.SPNs

import typings.microsoftDashAjax.SysNs.EventArgs
import typings.microsoftDashAjax.SysNs.NetNs.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
class PageRequestSucceededEventArgs () extends EventArgs {
  def get_executor(): WebRequestExecutor = js.native
}

