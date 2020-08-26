package typings.pulumiAws.inputMod.appautoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var maxCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum capacity.
    */
  var minCapacity: js.UndefOr[Input[Double]] = js.native
}

object ScheduledActionScalableTargetAction {
  @scala.inline
  def apply(): ScheduledActionScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionScalableTargetAction]
  }
  @scala.inline
  implicit class ScheduledActionScalableTargetActionOps[Self <: ScheduledActionScalableTargetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxCapacity(value: Input[Double]): Self = this.set("maxCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCapacity: Self = this.set("maxCapacity", js.undefined)
    @scala.inline
    def setMinCapacity(value: Input[Double]): Self = this.set("minCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCapacity: Self = this.set("minCapacity", js.undefined)
  }
  
}

