package typings.sharepoint.SP

import typings.microsoftDashAjax.Sys.EventArgs
import typings.microsoftDashAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
class PageRequestSucceededEventArgs () extends EventArgs {
  def get_executor(): WebRequestExecutor = js.native
}

