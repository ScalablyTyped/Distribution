package typings
package reactDashPopperLib.reactDashPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperChildrenProps extends js.Object {
  var arrowProps: PopperArrowProps
  var outOfBoundaries: scala.Boolean | scala.Null
  var placement: popperDotJsLib.popperDotJsMod.Placement
  var ref: RefHandler
  var style: reactLib.reactMod.CSSProperties
  def scheduleUpdate(): scala.Unit
}

object PopperChildrenProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    placement: popperDotJsLib.popperDotJsMod.Placement,
    ref: RefHandler,
    scheduleUpdate: () => scala.Unit,
    style: reactLib.reactMod.CSSProperties,
    outOfBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  ): PopperChildrenProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, placement = placement, ref = ref, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[PopperChildrenProps]
  }
}

