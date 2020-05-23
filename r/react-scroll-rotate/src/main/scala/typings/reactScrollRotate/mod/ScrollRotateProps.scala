package typings.reactScrollRotate.mod

import typings.react.mod.ReactNode
import typings.reactScrollRotate.reactScrollRotateStrings.prec
import typings.reactScrollRotate.reactScrollRotateStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRotateProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var children: ReactNode
  var from: js.UndefOr[Double] = js.undefined
  var loops: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[px | prec] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object ScrollRotateProps {
  @scala.inline
  def apply(
    animationDuration: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    from: js.UndefOr[Double] = js.undefined,
    loops: js.UndefOr[Double] = js.undefined,
    method: px | prec = null,
    target: String = null,
    throttle: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): ScrollRotateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loops)) __obj.updateDynamic("loops")(loops.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRotateProps]
  }
}

