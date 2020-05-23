package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisDependency extends js.Object {
  var axisDependency: js.UndefOr[typings.reactNativeChartsWrapper.mod.AxisDependency] = js.undefined
  var scaleX: Double
  var scaleY: Double
  var xValue: Double
  var yValue: Double
}

object AxisDependency {
  @scala.inline
  def apply(
    scaleX: Double,
    scaleY: Double,
    xValue: Double,
    yValue: Double,
    axisDependency: typings.reactNativeChartsWrapper.mod.AxisDependency = null
  ): AxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDependency]
  }
}

