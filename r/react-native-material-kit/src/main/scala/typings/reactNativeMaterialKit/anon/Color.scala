package typings.reactNativeMaterialKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var paddingLeft: js.UndefOr[Double] = js.undefined
  var paddingRight: js.UndefOr[Double] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    paddingLeft: js.UndefOr[Double] = js.undefined,
    paddingRight: js.UndefOr[Double] = js.undefined
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

