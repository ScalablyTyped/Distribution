package typings.rollup

import typings.rollup.mod.RollupWatcherEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChange extends js.Object {
  def change(id: String): Unit
  def event(event: RollupWatcherEvent): Unit
  def restart(): Unit
}

object AnonChange {
  @scala.inline
  def apply(change: String => Unit, event: RollupWatcherEvent => Unit, restart: () => Unit): AnonChange = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), event = js.Any.fromFunction1(event), restart = js.Any.fromFunction0(restart))
  
    __obj.asInstanceOf[AnonChange]
  }
}

