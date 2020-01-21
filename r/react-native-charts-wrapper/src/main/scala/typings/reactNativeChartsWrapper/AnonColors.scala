package typings.reactNativeChartsWrapper

import typings.reactNativeChartsWrapper.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonColors {
  @scala.inline
  def apply(colors: js.Array[Color] = null, labels: js.Array[String] = null): AnonColors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

