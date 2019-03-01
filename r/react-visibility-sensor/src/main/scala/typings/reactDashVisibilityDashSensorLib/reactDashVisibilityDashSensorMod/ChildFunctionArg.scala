package typings
package reactDashVisibilityDashSensorLib.reactDashVisibilityDashSensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildFunctionArg extends js.Object {
  var isVisible: scala.Boolean | scala.Null
  var visibilityRect: Shape
}

object ChildFunctionArg {
  @scala.inline
  def apply(visibilityRect: Shape, isVisible: js.UndefOr[scala.Boolean] = js.undefined): ChildFunctionArg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visibilityRect")(visibilityRect)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    __obj.asInstanceOf[ChildFunctionArg]
  }
}

