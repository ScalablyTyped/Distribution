package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRequestFailedEventArgs extends EventArgs {
  def get_errorMessage(): String
  def get_executor(): WebRequestExecutor
  def get_isErrorPage(): Boolean
}

object PageRequestFailedEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_errorMessage: () => String,
    get_executor: () => WebRequestExecutor,
    get_isErrorPage: () => Boolean
  ): PageRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_executor = js.Any.fromFunction0(get_executor), get_isErrorPage = js.Any.fromFunction0(get_isErrorPage))
    __obj.asInstanceOf[PageRequestFailedEventArgs]
  }
}

