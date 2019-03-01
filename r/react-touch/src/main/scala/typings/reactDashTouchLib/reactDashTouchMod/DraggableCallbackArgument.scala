package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableCallbackArgument extends DraggableStyle {
  var dx: scala.Double
  var dy: scala.Double
}

object DraggableCallbackArgument {
  @scala.inline
  def apply(
    dx: scala.Double,
    dy: scala.Double,
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null
  ): DraggableCallbackArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dx")(dx)
    __obj.updateDynamic("dy")(dy)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableCallbackArgument]
  }
}

