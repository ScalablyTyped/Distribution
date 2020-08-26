package typings.reactCountup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  def pauseResume(): Unit = js.native
  def start(): Unit = js.native
  def update(): Unit = js.native
}

object Update {
  @scala.inline
  def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): Update = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
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
    def setPauseResume(value: () => Unit): Self = this.set("pauseResume", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

