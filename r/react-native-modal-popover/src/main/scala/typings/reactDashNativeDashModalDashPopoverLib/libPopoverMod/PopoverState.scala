package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverState
  extends reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Geometry {
  var animation: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  var contentSize: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Size
  var isAwaitingShow: scala.Boolean
  var visible: scala.Boolean
}

object PopoverState {
  @scala.inline
  def apply(
    anchor: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Point,
    animation: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    contentSize: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Size,
    isAwaitingShow: scala.Boolean,
    origin: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Point,
    placement: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Placement,
    visible: scala.Boolean
  ): PopoverState = {
    val __obj = js.Dynamic.literal(anchor = anchor, animation = animation, contentSize = contentSize, isAwaitingShow = isAwaitingShow, origin = origin, placement = placement, visible = visible)
  
    __obj.asInstanceOf[PopoverState]
  }
}

