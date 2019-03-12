package typings
package smoothDashScrollbarLib.interfacesTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarThumb extends js.Object {
  var displaySize: scala.Double
  val element: stdLib.HTMLElement
  var offset: scala.Double
  var realSize: scala.Double
  def attachTo(track: stdLib.HTMLElement): scala.Unit
  def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit
}

object ScrollbarThumb {
  @scala.inline
  def apply(
    attachTo: stdLib.HTMLElement => scala.Unit,
    displaySize: scala.Double,
    element: stdLib.HTMLElement,
    offset: scala.Double,
    realSize: scala.Double,
    update: (scala.Double, scala.Double, scala.Double) => scala.Unit
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), displaySize = displaySize, element = element, offset = offset, realSize = realSize, update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[ScrollbarThumb]
  }
}

