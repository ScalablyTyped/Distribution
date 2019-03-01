package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  var border: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var corner: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var mimic: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Tip {
  @scala.inline
  def apply(
    border: scala.Double | scala.Boolean = null,
    corner: java.lang.String | scala.Boolean = null,
    height: scala.Int | scala.Double = null,
    mimic: java.lang.String | scala.Boolean = null,
    offset: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

