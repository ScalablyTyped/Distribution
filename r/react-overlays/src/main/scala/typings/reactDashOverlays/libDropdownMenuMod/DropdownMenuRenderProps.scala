package typings.reactDashOverlays.libDropdownMenuMod

import typings.react.reactMod.SyntheticEvent
import typings.reactDashOverlays.Anon_Arialabelledby
import typings.reactDashOverlays.Anon_Key
import typings.reactDashOverlays.libOverlayMod.OverlayRenderProps
import typings.reactDashOverlays.libOverlayMod.Placements
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuRenderProps extends OverlayRenderProps {
  var alignEnd: Boolean
  def close(event: SyntheticEvent[_, Event]): Unit
}

object DropdownMenuRenderProps {
  @scala.inline
  def apply(
    alignEnd: Boolean,
    arrowProps: Anon_Key,
    close: SyntheticEvent[_, Event] => Unit,
    placement: Placements,
    props: Anon_Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuRenderProps = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd, arrowProps = arrowProps, close = js.Any.fromFunction1(close), placement = placement, props = props, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[DropdownMenuRenderProps]
  }
}

