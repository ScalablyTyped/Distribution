package typings.reactHooksHelper.mod

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
    autoAdvanceDuration: js.UndefOr[Double] = js.undefined,
    initialStep: js.UndefOr[Double] = js.undefined
  ): UseStepParams = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdvanceDuration)) __obj.updateDynamic("autoAdvanceDuration")(autoAdvanceDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialStep)) __obj.updateDynamic("initialStep")(initialStep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepParams]
  }
}

