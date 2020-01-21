package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerStyle extends js.Object {
  var strokeColor: js.UndefOr[js.Array[String]] = js.undefined
}

object SpinnerStyle {
  @scala.inline
  def apply(strokeColor: js.Array[String] = null): SpinnerStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerStyle]
  }
}

