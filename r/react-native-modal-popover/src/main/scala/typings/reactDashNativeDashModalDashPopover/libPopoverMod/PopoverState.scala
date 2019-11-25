package typings.reactDashNativeDashModalDashPopover.libPopoverMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Geometry
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Placement
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Point
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverState extends Geometry {
  var animation: Value
  var contentSize: Size
  var isAwaitingShow: Boolean
  var visible: Boolean
}

object PopoverState {
  @scala.inline
  def apply(
    anchor: Point,
    animation: Value,
    contentSize: Size,
    isAwaitingShow: Boolean,
    origin: Point,
    placement: Placement,
    visible: Boolean
  ): PopoverState = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], isAwaitingShow = isAwaitingShow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverState]
  }
}

