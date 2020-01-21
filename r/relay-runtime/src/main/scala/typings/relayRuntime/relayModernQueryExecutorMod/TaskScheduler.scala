package typings.relayRuntime.relayModernQueryExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskScheduler extends js.Object {
  def cancel(id: String): Unit
  def schedule(fn: js.Function0[Unit]): String
}

object TaskScheduler {
  @scala.inline
  def apply(cancel: String => Unit, schedule: js.Function0[Unit] => String): TaskScheduler = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), schedule = js.Any.fromFunction1(schedule))
  
    __obj.asInstanceOf[TaskScheduler]
  }
}

