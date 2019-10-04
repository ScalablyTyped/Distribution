package typings.reactDashScrollDashRotate.reactDashScrollDashRotateMod

import typings.react.reactMod.ReactNode
import typings.reactDashScrollDashRotate.reactDashScrollDashRotateStrings.prec
import typings.reactDashScrollDashRotate.reactDashScrollDashRotateStrings.px
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
    children: ReactNode,
    animationDuration: Int | Double = null,
    from: Int | Double = null,
    loops: Int | Double = null,
    method: px | prec = null,
    target: String = null,
    throttle: Int | Double = null,
    to: Int | Double = null
  ): ScrollRotateProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loops != null) __obj.updateDynamic("loops")(loops.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRotateProps]
  }
}

