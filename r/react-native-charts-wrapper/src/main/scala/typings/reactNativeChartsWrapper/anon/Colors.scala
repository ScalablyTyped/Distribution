package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.UndefOr[js.Array[typings.reactNativeChartsWrapper.mod.Color]] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    colors: js.Array[typings.reactNativeChartsWrapper.mod.Color] = null,
    labels: js.Array[String] = null
  ): Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

