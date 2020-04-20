package typings.reactVirtualized.esGridMod

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
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollDirectionHorizontal = scrollDirectionHorizontal.asInstanceOf[js.Any], scrollDirectionVertical = scrollDirectionVertical.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridState]
  }
}

