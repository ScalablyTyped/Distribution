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
    attachTo: js.Function1[stdLib.HTMLElement, scala.Unit],
    element: stdLib.HTMLElement,
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    thumb: ScrollbarThumb,
    update: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]
  ): ScrollbarTrack = {
    val __obj = js.Dynamic.literal(attachTo = attachTo, element = element, hide = hide, show = show, thumb = thumb, update = update)
  
    __obj.asInstanceOf[ScrollbarTrack]
  }
}

