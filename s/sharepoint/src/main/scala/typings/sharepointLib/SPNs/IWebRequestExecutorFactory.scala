package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IWebRequestExecutorFactory extends js.Object {
  def createWebRequestExecutor(): microsoftDashAjaxLib.SysNs.NetNs.WebRequestExecutor
}

object IWebRequestExecutorFactory {
  @scala.inline
  def apply(createWebRequestExecutor: js.Function0[microsoftDashAjaxLib.SysNs.NetNs.WebRequestExecutor]): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = createWebRequestExecutor)
  
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
}

