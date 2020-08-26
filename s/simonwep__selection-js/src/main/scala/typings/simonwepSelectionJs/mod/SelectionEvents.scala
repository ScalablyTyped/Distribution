package typings.simonwepSelectionJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionEvents extends js.Object {
  def beforestart(e: SelectionEvent): Boolean = js.native
  def move(e: SelectionEvent): Unit = js.native
  def start(e: SelectionEvent): Unit = js.native
  def stop(e: SelectionEvent): Unit = js.native
}

object SelectionEvents {
  @scala.inline
  def apply(
    beforestart: SelectionEvent => Boolean,
    move: SelectionEvent => Unit,
    start: SelectionEvent => Unit,
    stop: SelectionEvent => Unit
  ): SelectionEvents = {
    val __obj = js.Dynamic.literal(beforestart = js.Any.fromFunction1(beforestart), move = js.Any.fromFunction1(move), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[SelectionEvents]
  }
  @scala.inline
  implicit class SelectionEventsOps[Self <: SelectionEvents] (val x: Self) extends AnyVal {
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
    def setBeforestart(value: SelectionEvent => Boolean): Self = this.set("beforestart", js.Any.fromFunction1(value))
    @scala.inline
    def setMove(value: SelectionEvent => Unit): Self = this.set("move", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: SelectionEvent => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: SelectionEvent => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
  }
  
}

