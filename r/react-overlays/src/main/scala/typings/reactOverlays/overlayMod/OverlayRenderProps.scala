package typings.reactOverlays.overlayMod

import typings.reactOverlays.anon.Arialabelledby
import typings.reactOverlays.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayRenderProps extends js.Object {
  var arrowProps: Ref
  var outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  var placement: Placements
  var props: Arialabelledby
  var show: Boolean
  def scheduleUpdate(): Unit
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: Ref,
    placement: Placements,
    props: Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayRenderProps]
  }
}

