package typings
package reactDashOverlaysLib.libOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayRenderProps extends js.Object {
  var arrowProps: reactDashOverlaysLib.Anon_Element
  var outOfBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  var placement: Placements
  var props: reactDashOverlaysLib.Anon_Arialabelledby
  var show: scala.Boolean
  def scheduleUpdate(): scala.Unit
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: reactDashOverlaysLib.Anon_Element,
    placement: Placements,
    props: reactDashOverlaysLib.Anon_Arialabelledby,
    scheduleUpdate: () => scala.Unit,
    show: scala.Boolean,
    outOfBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, placement = placement, props = props, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[OverlayRenderProps]
  }
}

