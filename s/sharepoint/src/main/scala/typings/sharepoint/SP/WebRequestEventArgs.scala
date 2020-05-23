package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebRequestEventArgs extends EventArgs {
  def get_webRequest(): WebRequest
}

object WebRequestEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_webRequest: () => WebRequest): WebRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[WebRequestEventArgs]
  }
}

