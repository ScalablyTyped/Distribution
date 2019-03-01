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
  var style: reactLib.reactMod.ReactNs.CSSProperties
  var wasSticky: scala.Boolean
}

object StickyChildArgs {
  @scala.inline
  def apply(
    calculatedHeight: scala.Double,
    distanceFromBottom: scala.Double,
    distanceFromTop: scala.Double,
    isSticky: scala.Boolean,
    style: reactLib.reactMod.ReactNs.CSSProperties,
    wasSticky: scala.Boolean
  ): StickyChildArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculatedHeight")(calculatedHeight)
    __obj.updateDynamic("distanceFromBottom")(distanceFromBottom)
    __obj.updateDynamic("distanceFromTop")(distanceFromTop)
    __obj.updateDynamic("isSticky")(isSticky)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("wasSticky")(wasSticky)
    __obj.asInstanceOf[StickyChildArgs]
  }
}

