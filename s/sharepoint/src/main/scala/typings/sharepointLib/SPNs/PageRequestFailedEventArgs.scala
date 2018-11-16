package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestFailedEventArgs")
@js.native
class PageRequestFailedEventArgs ()
  extends microsoftDashAjaxLib.SysNs.EventArgs {
  def get_errorMessage(): java.lang.String = js.native
  def get_executor(): microsoftDashAjaxLib.SysNs.NetNs.WebRequestExecutor = js.native
  def get_isErrorPage(): scala.Boolean = js.native
}

