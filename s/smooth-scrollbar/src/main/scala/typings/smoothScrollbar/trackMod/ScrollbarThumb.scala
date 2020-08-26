package typings.smoothScrollbar.trackMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarThumb extends js.Object {
  var displaySize: Double = js.native
  val element: HTMLElement = js.native
  var offset: Double = js.native
  var realSize: Double = js.native
  def attachTo(track: HTMLElement): Unit = js.native
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

object ScrollbarThumb {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Unit,
    displaySize: Double,
    element: HTMLElement,
    offset: Double,
    realSize: Double,
    update: (Double, Double, Double) => Unit
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[ScrollbarThumb]
  }
  @scala.inline
  implicit class ScrollbarThumbOps[Self <: ScrollbarThumb] (val x: Self) extends AnyVal {
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
    def setDisplaySize(value: Double): Self = this.set("displaySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealSize(value: Double): Self = this.set("realSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (Double, Double, Double) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}

