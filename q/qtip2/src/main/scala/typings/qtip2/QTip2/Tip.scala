package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  var border: js.UndefOr[Double | Boolean] = js.undefined
  var corner: js.UndefOr[String | Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mimic: js.UndefOr[String | Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Tip {
  @scala.inline
  def apply(
    border: Double | Boolean = null,
    corner: String | Boolean = null,
    height: js.UndefOr[Double] = js.undefined,
    mimic: String | Boolean = null,
    offset: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Tip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mimic != null) __obj.updateDynamic("mimic")(mimic.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
}

