package typings.reactDashNativeDashModalDashPopover.libPopoverMod

import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
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
    val __obj = js.Dynamic.literal(anchor = anchor, animation = animation, contentSize = contentSize, isAwaitingShow = isAwaitingShow, origin = origin, placement = placement, visible = visible)
  
    __obj.asInstanceOf[PopoverState]
  }
}

