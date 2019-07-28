package typings.reactDashPopper.reactDashPopperMod

import typings.popperDotJs.popperDotJsMod.Placement
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var ref: RefHandler
  var style: CSSProperties
  def scheduleUpdate(): Unit
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    placement: Placement,
    ref: RefHandler,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, placement = placement, ref = ref, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[PopperChildrenProps]
  }
}

