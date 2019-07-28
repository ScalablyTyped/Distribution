package typings.reactDashVirtualized.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridState extends js.Object {
  var isScrolling: Boolean
  var scrollDirectionHorizontal: ScrollDirection
  var scrollDirectionVertical: ScrollDirection
  var scrollLeft: Double
  var scrollTop: Double
}

object GridState {
  @scala.inline
  def apply(
    isScrolling: Boolean,
    scrollDirectionHorizontal: ScrollDirection,
    scrollDirectionVertical: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double
  ): GridState = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling, scrollDirectionHorizontal = scrollDirectionHorizontal, scrollDirectionVertical = scrollDirectionVertical, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[GridState]
  }
}

