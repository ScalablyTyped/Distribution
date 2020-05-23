package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRequestSucceededEventArgs extends EventArgs {
  def get_executor(): WebRequestExecutor
}

object PageRequestSucceededEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_executor: () => WebRequestExecutor): PageRequestSucceededEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_executor = js.Any.fromFunction0(get_executor))
    __obj.asInstanceOf[PageRequestSucceededEventArgs]
  }
}

