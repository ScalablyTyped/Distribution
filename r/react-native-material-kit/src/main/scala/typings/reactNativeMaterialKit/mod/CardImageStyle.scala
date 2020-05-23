package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImageStyle extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var resizeMode: js.UndefOr[String] = js.undefined
}

object CardImageStyle {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, resizeMode: String = null): CardImageStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardImageStyle]
  }
}

