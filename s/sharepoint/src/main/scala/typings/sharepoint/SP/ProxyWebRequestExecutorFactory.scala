package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyWebRequestExecutorFactory extends IWebRequestExecutorFactory

object ProxyWebRequestExecutorFactory {
  @scala.inline
  def apply(createWebRequestExecutor: () => WebRequestExecutor): ProxyWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[ProxyWebRequestExecutorFactory]
  }
}

