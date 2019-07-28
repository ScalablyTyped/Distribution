package typings.pusherDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activity extends js.Object {
  def activity(): Unit
  def closed(): Unit
  def error(error: js.Any): Unit
  def message(message: String): Unit
  def ping(): Unit
}

object Anon_Activity {
  @scala.inline
  def apply(
    activity: () => Unit,
    closed: () => Unit,
    error: js.Any => Unit,
    message: String => Unit,
    ping: () => Unit
  ): Anon_Activity = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
  
    __obj.asInstanceOf[Anon_Activity]
  }
}

