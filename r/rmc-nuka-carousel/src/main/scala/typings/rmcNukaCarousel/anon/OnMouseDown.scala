package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMouseDown extends js.Object {
  def onMouseDown(e: js.Any): Unit = js.native
  def onMouseLeave(e: js.Any): Unit = js.native
  def onMouseMove(e: js.Any): Unit = js.native
  def onMouseOut(): Unit = js.native
  def onMouseOver(): Unit = js.native
  def onMouseUp(e: js.Any): Unit = js.native
}

object OnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: js.Any => Unit,
    onMouseLeave: js.Any => Unit,
    onMouseMove: js.Any => Unit,
    onMouseOut: () => Unit,
    onMouseOver: () => Unit,
    onMouseUp: js.Any => Unit
  ): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOut = js.Any.fromFunction0(onMouseOut), onMouseOver = js.Any.fromFunction0(onMouseOver), onMouseUp = js.Any.fromFunction1(onMouseUp))
    __obj.asInstanceOf[OnMouseDown]
  }
  @scala.inline
  implicit class OnMouseDownOps[Self <: OnMouseDown] (val x: Self) extends AnyVal {
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
    def setOnMouseDown(value: js.Any => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseLeave(value: js.Any => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseMove(value: js.Any => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseOut(value: () => Unit): Self = this.set("onMouseOut", js.Any.fromFunction0(value))
    @scala.inline
    def setOnMouseOver(value: () => Unit): Self = this.set("onMouseOver", js.Any.fromFunction0(value))
    @scala.inline
    def setOnMouseUp(value: js.Any => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
  }
  
}

