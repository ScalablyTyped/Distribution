package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridState extends js.Object {
  var isScrolling: scala.Boolean
  var scrollDirectionHorizontal: ScrollDirection
  var scrollDirectionVertical: ScrollDirection
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object GridState {
  @scala.inline
  def apply(
    isScrolling: scala.Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: scala.Double,
    scrollTop: scala.Double
  ): GridState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("scrollDirectionHorizontal")(scrollDirectionHorizontal)
    __obj.updateDynamic("scrollDirectionVertical")(scrollDirectionVertical)
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[GridState]
  }
}

