package typings.reactDashHooksDashHelper.reactDashHooksDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseStepParams extends js.Object {
  var autoAdvanceDuration: js.UndefOr[Double] = js.undefined
  var initialStep: js.UndefOr[Double] = js.undefined
  var steps: js.Array[String] | Double
}

object UseStepParams {
  @scala.inline
  def apply(
    steps: js.Array[String] | Double,
    autoAdvanceDuration: Int | Double = null,
    initialStep: Int | Double = null
  ): UseStepParams = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (autoAdvanceDuration != null) __obj.updateDynamic("autoAdvanceDuration")(autoAdvanceDuration.asInstanceOf[js.Any])
    if (initialStep != null) __obj.updateDynamic("initialStep")(initialStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepParams]
  }
}

