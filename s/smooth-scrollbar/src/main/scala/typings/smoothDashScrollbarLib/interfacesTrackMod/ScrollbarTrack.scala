package typings
package smoothDashScrollbarLib.interfacesTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarTrack extends js.Object {
  val element: stdLib.HTMLElement
  val thumb: ScrollbarThumb
  def attachTo(container: stdLib.HTMLElement): scala.Unit
  def hide(): scala.Unit
  def show(): scala.Unit
  def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit
}

object ScrollbarTrack {
  @scala.inline
  def apply(
    attachTo: stdLib.HTMLElement => scala.Unit,
    element: stdLib.HTMLElement,
    hide: () => scala.Unit,
    show: () => scala.Unit,
    thumb: ScrollbarThumb,
    update: (scala.Double, scala.Double, scala.Double) => scala.Unit
  ): ScrollbarTrack = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), element = element, hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), thumb = thumb, update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[ScrollbarTrack]
  }
}

