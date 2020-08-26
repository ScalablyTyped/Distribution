package typings.smoothScrollbar.trackMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarTrack extends js.Object {
  val element: HTMLElement = js.native
  val thumb: ScrollbarThumb = js.native
  def attachTo(container: HTMLElement): Unit = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

object ScrollbarTrack {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Unit,
    element: HTMLElement,
    hide: () => Unit,
    show: () => Unit,
    thumb: ScrollbarThumb,
    update: (Double, Double, Double) => Unit
  ): ScrollbarTrack = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), thumb = thumb.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[ScrollbarTrack]
  }
  @scala.inline
  implicit class ScrollbarTrackOps[Self <: ScrollbarTrack] (val x: Self) extends AnyVal {
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
    def setAttachTo(value: HTMLElement => Unit): Self = this.set("attachTo", js.Any.fromFunction1(value))
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setThumb(value: ScrollbarThumb): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Double, Double, Double) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}

