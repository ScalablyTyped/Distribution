package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Position property
	 */
trait PositionAdjust extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var mouse: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PositionAdjust {
  @scala.inline
  def apply(
    method: String = null,
    mouse: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): PositionAdjust = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(mouse)) __obj.updateDynamic("mouse")(mouse)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionAdjust]
  }
}

