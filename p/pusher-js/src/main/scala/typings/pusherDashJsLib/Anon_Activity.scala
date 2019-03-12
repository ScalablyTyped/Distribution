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
    activity: () => scala.Unit,
    closed: () => scala.Unit,
    error: js.Any => scala.Unit,
    message: java.lang.String => scala.Unit,
    ping: () => scala.Unit
  ): Anon_Activity = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
  
    __obj.asInstanceOf[Anon_Activity]
  }
}

