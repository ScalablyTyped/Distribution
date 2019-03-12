package typings
package reactDashOverlaysLib.libDropdownMenuMod.DropdownMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuRenderProps
  extends reactDashOverlaysLib.libOverlayMod.OverlayNs.OverlayRenderProps {
  var alignEnd: scala.Boolean
  def close(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit
}

object DropdownMenuRenderProps {
  @scala.inline
  def apply(
    alignEnd: scala.Boolean,
    arrowProps: reactDashOverlaysLib.Anon_Element,
    close: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event] => scala.Unit,
    placement: reactDashOverlaysLib.libOverlayMod.OverlayNs.Placements,
    props: reactDashOverlaysLib.Anon_Arialabelledby,
    scheduleUpdate: () => scala.Unit,
    show: scala.Boolean,
    outOfBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownMenuRenderProps = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd, arrowProps = arrowProps, close = js.Any.fromFunction1(close), placement = placement, props = props, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[DropdownMenuRenderProps]
  }
}

