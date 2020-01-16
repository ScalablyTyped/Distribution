package typings.reactDashNativeDashChartsDashWrapper

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(colors: js.Array[Color] = null, labels: js.Array[String] = null): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

