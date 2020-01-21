package typings.smoothScrollbar.trackMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarTrack extends js.Object {
  val element: HTMLElement
  val thumb: ScrollbarThumb
  def attachTo(container: HTMLElement): Unit
  def hide(): Unit
  def show(): Unit
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
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
}

