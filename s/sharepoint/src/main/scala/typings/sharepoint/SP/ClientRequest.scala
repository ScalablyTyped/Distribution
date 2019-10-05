package typings.sharepoint.SP

import typings.microsoftDashAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequest")
@js.native
class ClientRequest () extends js.Object {
  def add_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def add_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def get_navigateWhenServerRedirect(): Boolean = js.native
  def get_webRequest(): WebRequest = js.native
  def remove_requestFailed(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestFailedEventArgs, Unit]): Unit = js.native
  def remove_requestSucceeded(value: js.Function2[/* sender */ js.Any, /* args */ ClientRequestSucceededEventArgs, Unit]): Unit = js.native
  def set_navigateWhenServerRedirect(value: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("SP.ClientRequest")
@js.native
object ClientRequest extends js.Object {
  def get_nextSequenceId(): Double = js.native
}

