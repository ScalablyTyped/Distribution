package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieValue extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: Double
}

object PieValue {
  @scala.inline
  def apply(value: Double, label: String = null): PieValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieValue]
  }
}

