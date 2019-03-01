package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerStyle extends js.Object {
  var strokeColor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SpinnerStyle {
  @scala.inline
  def apply(strokeColor: js.Array[java.lang.String] = null): SpinnerStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    __obj.asInstanceOf[SpinnerStyle]
  }
}

