package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activity extends js.Object {
  def activity(): scala.Unit
  def closed(): scala.Unit
  def error(error: js.Any): scala.Unit
  def message(message: java.lang.String): scala.Unit
  def ping(): scala.Unit
}

object Anon_Activity {
  @scala.inline
  def apply(
    activity: js.Function0[scala.Unit],
    closed: js.Function0[scala.Unit],
    error: js.Function1[js.Any, scala.Unit],
    message: js.Function1[java.lang.String, scala.Unit],
    ping: js.Function0[scala.Unit]
  ): Anon_Activity = {
    val __obj = js.Dynamic.literal(activity = activity, closed = closed, error = error, message = message, ping = ping)
  
    __obj.asInstanceOf[Anon_Activity]
  }
}

