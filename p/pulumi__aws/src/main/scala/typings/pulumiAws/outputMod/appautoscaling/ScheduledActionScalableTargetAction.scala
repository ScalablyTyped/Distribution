package typings.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var maxCapacity: js.UndefOr[Double] = js.native
  /**
    * The minimum capacity.
    */
  var minCapacity: js.UndefOr[Double] = js.native
}

object ScheduledActionScalableTargetAction {
  @scala.inline
  def apply(maxCapacity: js.UndefOr[Double] = js.undefined, minCapacity: js.UndefOr[Double] = js.undefined): ScheduledActionScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxCapacity)) __obj.updateDynamic("maxCapacity")(maxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCapacity)) __obj.updateDynamic("minCapacity")(minCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionScalableTargetAction]
  }
}

