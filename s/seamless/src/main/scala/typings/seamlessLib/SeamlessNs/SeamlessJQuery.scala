package typings
package seamlessLib.SeamlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeamlessJQuery
  extends seamlessLib.JQuery {
  var connection: Connection = js.native
  var seamless_options: Options = js.native
  def receive(callback: Callback): scala.Unit = js.native
  def receive(`type`: java.lang.String, callback: Callback): scala.Unit = js.native
  def seamless_error(data: js.Any, event: js.Any): scala.Unit = js.native
  def seamless_ready(data: js.Any, event: js.Any): scala.Unit = js.native
  def seamless_update(data: js.Any, event: js.Any): js.Any = js.native
  def send(data: js.Any): scala.Unit = js.native
}

