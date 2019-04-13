package typings
package reactDashStickyLib.reactDashStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyChildArgs extends js.Object {
  var calculatedHeight: scala.Double
  var distanceFromBottom: scala.Double
  var distanceFromTop: scala.Double
  var isSticky: scala.Boolean
  var style: reactLib.reactMod.CSSProperties
  var wasSticky: scala.Boolean
}

object StickyChildArgs {
  @scala.inline
  def apply(
    calculatedHeight: scala.Double,
    distanceFromBottom: scala.Double,
    distanceFromTop: scala.Double,
    isSticky: scala.Boolean,
    style: reactLib.reactMod.CSSProperties,
    wasSticky: scala.Boolean
  ): StickyChildArgs = {
    val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight, distanceFromBottom = distanceFromBottom, distanceFromTop = distanceFromTop, isSticky = isSticky, style = style, wasSticky = wasSticky)
  
    __obj.asInstanceOf[StickyChildArgs]
  }
}

