package typings.qtip2.QTip2Ns

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
    height: Int | Double = null,
    mimic: String | Boolean = null,
    offset: Int | Double = null,
    width: Int | Double = null
  ): Tip = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mimic != null) __obj.updateDynamic("mimic")(mimic.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
}

