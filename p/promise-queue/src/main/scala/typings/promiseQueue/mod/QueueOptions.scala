package typings.promiseQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions extends js.Object {
  /**
    * Callback that is called when the queue is empty and all pending promises have resolved
    */
  def onEmpty(): Unit = js.native
}

object QueueOptions {
  @scala.inline
  def apply(onEmpty: () => Unit): QueueOptions = {
    val __obj = js.Dynamic.literal(onEmpty = js.Any.fromFunction0(onEmpty))
    __obj.asInstanceOf[QueueOptions]
  }
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
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
    def setOnEmpty(value: () => Unit): Self = this.set("onEmpty", js.Any.fromFunction0(value))
  }
  
}

