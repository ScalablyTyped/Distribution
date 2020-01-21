package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ProxyWebRequestExecutorFactory")
@js.native
class ProxyWebRequestExecutorFactory protected () extends IWebRequestExecutorFactory {
  def this(url: String) = this()
  def this(url: String, options: js.Any) = this()
  /* CompleteClass */
  override def createWebRequestExecutor(): WebRequestExecutor = js.native
}

