package typings
package reactDashHooksDashHelperLib.reactDashHooksDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseStepParams extends js.Object {
  var autoAdvanceDuration: js.UndefOr[scala.Double] = js.undefined
  var initialStep: js.UndefOr[scala.Double] = js.undefined
  var steps: js.Array[java.lang.String] | scala.Double
}

object UseStepParams {
  @scala.inline
  def apply(
    steps: js.Array[java.lang.String] | scala.Double,
    autoAdvanceDuration: scala.Int | scala.Double = null,
    initialStep: scala.Int | scala.Double = null
  ): UseStepParams = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (autoAdvanceDuration != null) __obj.updateDynamic("autoAdvanceDuration")(autoAdvanceDuration.asInstanceOf[js.Any])
    if (initialStep != null) __obj.updateDynamic("initialStep")(initialStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepParams]
  }
}

