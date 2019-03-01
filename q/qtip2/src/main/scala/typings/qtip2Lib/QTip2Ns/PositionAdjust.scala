package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Position property
	 */
trait PositionAdjust extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mouse: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object PositionAdjust {
  @scala.inline
  def apply(
    method: java.lang.String = null,
    mouse: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
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

