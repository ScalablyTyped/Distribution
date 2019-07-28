package typings.reactDashVisibilityDashSensor.reactDashVisibilityDashSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildFunctionArg extends js.Object {
  var isVisible: Boolean | Null
  var visibilityRect: Shape
}

object ChildFunctionArg {
  @scala.inline
  def apply(visibilityRect: Shape, isVisible: js.UndefOr[Boolean] = js.undefined): ChildFunctionArg = {
    val __obj = js.Dynamic.literal(visibilityRect = visibilityRect)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    __obj.asInstanceOf[ChildFunctionArg]
  }
}

