package typings.reactDashSticky.reactDashStickyMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyChildArgs extends js.Object {
  var calculatedHeight: Double
  var distanceFromBottom: Double
  var distanceFromTop: Double
  var isSticky: Boolean
  var style: CSSProperties
  var wasSticky: Boolean
}

object StickyChildArgs {
  @scala.inline
  def apply(
    calculatedHeight: Double,
    distanceFromBottom: Double,
    distanceFromTop: Double,
    isSticky: Boolean,
    style: CSSProperties,
    wasSticky: Boolean
  ): StickyChildArgs = {
    val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight, distanceFromBottom = distanceFromBottom, distanceFromTop = distanceFromTop, isSticky = isSticky, style = style, wasSticky = wasSticky)
  
    __obj.asInstanceOf[StickyChildArgs]
  }
}

