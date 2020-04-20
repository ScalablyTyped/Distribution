package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IWebRequestExecutorFactory extends js.Object {
  def createWebRequestExecutor(): WebRequestExecutor
}

object IWebRequestExecutorFactory {
  @scala.inline
  def apply(createWebRequestExecutor: () => WebRequestExecutor): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
}

