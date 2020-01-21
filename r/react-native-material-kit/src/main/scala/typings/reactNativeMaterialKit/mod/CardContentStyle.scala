package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardContentStyle extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
}

object CardContentStyle {
  @scala.inline
  def apply(color: String = null, padding: Int | Double = null): CardContentStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardContentStyle]
  }
}

