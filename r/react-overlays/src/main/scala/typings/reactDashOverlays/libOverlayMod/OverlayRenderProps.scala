package typings.reactDashOverlays.libOverlayMod

import typings.reactDashOverlays.Anon_Arialabelledby
import typings.reactDashOverlays.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayRenderProps extends js.Object {
  var arrowProps: Anon_Key
  var outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  var placement: Placements
  var props: Anon_Arialabelledby
  var show: Boolean
  def scheduleUpdate(): Unit
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: Anon_Key,
    placement: Placements,
    props: Anon_Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, placement = placement, props = props, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[OverlayRenderProps]
  }
}

