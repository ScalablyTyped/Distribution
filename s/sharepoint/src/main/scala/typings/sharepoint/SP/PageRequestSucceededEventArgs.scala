package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
class PageRequestSucceededEventArgs () extends EventArgs {
  def get_executor(): WebRequestExecutor = js.native
}

