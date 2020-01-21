package typings.reactSticky.mod

import typings.react.mod.CSSProperties
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
    val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight.asInstanceOf[js.Any], distanceFromBottom = distanceFromBottom.asInstanceOf[js.Any], distanceFromTop = distanceFromTop.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], wasSticky = wasSticky.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StickyChildArgs]
  }
}

