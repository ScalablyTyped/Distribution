package typings.rollup.anon

import typings.rollup.mod.RollupWatcherEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  def change(id: String): Unit = js.native
  def event(event: RollupWatcherEvent): Unit = js.native
  def restart(): Unit = js.native
}

object Change {
  @scala.inline
  def apply(change: String => Unit, event: RollupWatcherEvent => Unit, restart: () => Unit): Change = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), event = js.Any.fromFunction1(event), restart = js.Any.fromFunction0(restart))
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChange(value: String => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def setEvent(value: RollupWatcherEvent => Unit): Self = this.set("event", js.Any.fromFunction1(value))
    @scala.inline
    def setRestart(value: () => Unit): Self = this.set("restart", js.Any.fromFunction0(value))
  }
  
}

