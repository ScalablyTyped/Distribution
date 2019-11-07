package typings.reactDashPopper.reactDashPopperMod

import typings.popperDotJs.popperDotJsMod.Placement
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var ref: Ref[_]
  var style: CSSProperties
  def scheduleUpdate(): Unit
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined,
    ref: Ref[_] = null
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, placement = placement, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperChildrenProps]
  }
}

