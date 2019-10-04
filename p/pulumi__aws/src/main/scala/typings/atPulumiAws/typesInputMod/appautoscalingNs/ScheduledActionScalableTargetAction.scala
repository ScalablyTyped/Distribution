package typings.atPulumiAws.typesInputMod.appautoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledActionScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var maxCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The minimum capacity.
    */
  var minCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object ScheduledActionScalableTargetAction {
  @scala.inline
  def apply(maxCapacity: Input[Double] = null, minCapacity: Input[Double] = null): ScheduledActionScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionScalableTargetAction]
  }
}

