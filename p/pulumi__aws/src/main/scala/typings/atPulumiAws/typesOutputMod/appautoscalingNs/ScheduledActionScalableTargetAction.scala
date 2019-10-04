package typings.atPulumiAws.typesOutputMod.appautoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledActionScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var maxCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The minimum capacity.
    */
  var minCapacity: js.UndefOr[Double] = js.undefined
}

object ScheduledActionScalableTargetAction {
  @scala.inline
  def apply(maxCapacity: Int | Double = null, minCapacity: Int | Double = null): ScheduledActionScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionScalableTargetAction]
  }
}

