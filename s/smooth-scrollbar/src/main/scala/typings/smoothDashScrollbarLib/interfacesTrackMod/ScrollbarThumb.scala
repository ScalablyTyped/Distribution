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
    attachTo: js.Function1[stdLib.HTMLElement, scala.Unit],
    displaySize: scala.Double,
    element: stdLib.HTMLElement,
    offset: scala.Double,
    realSize: scala.Double,
    update: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachTo")(attachTo)
    __obj.updateDynamic("displaySize")(displaySize)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("realSize")(realSize)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ScrollbarThumb]
  }
}

