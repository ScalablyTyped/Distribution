package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequest")
@js.native
class ClientRequest () extends js.Object {
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def get_navigateWhenServerRedirect(): scala.Boolean = js.native
  def get_webRequest(): microsoftDashAjaxLib.SysNs.NetNs.WebRequest = js.native
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, scala.Unit]): scala.Unit = js.native
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, scala.Unit]): scala.Unit = js.native
  def set_navigateWhenServerRedirect(value: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.ClientRequest")
@js.native
object ClientRequest extends js.Object {
  def get_nextSequenceId(): scala.Double = js.native
}

