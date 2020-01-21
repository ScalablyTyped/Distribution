package typings.reactNativeChartsWrapper

import typings.reactNativeChartsWrapper.mod.AxisDependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxisDependency extends js.Object {
  var axisDependency: js.UndefOr[AxisDependency] = js.undefined
  var scaleX: Double
  var scaleY: Double
  var xValue: Double
  var yValue: Double
}

object AnonAxisDependency {
  @scala.inline
  def apply(
    scaleX: Double,
    scaleY: Double,
    xValue: Double,
    yValue: Double,
    axisDependency: AxisDependency = null
  ): AnonAxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxisDependency]
  }
}

