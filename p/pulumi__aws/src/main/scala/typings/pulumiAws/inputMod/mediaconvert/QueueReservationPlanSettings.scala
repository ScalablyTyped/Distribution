package typings.pulumiAws.inputMod.mediaconvert

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueReservationPlanSettings extends js.Object {
  /**
    * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
    */
  var commitment: Input[String] = js.native
  /**
    * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
    */
  var renewalType: Input[String] = js.native
  /**
    * Specifies the number of reserved transcode slots (RTS) for queue.
    */
  var reservedSlots: Input[Double] = js.native
}

object QueueReservationPlanSettings {
  @scala.inline
  def apply(commitment: Input[String], renewalType: Input[String], reservedSlots: Input[Double]): QueueReservationPlanSettings = {
    val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], renewalType = renewalType.asInstanceOf[js.Any], reservedSlots = reservedSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReservationPlanSettings]
  }
  @scala.inline
  implicit class QueueReservationPlanSettingsOps[Self <: QueueReservationPlanSettings] (val x: Self) extends AnyVal {
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
    def setCommitment(value: Input[String]): Self = this.set("commitment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewalType(value: Input[String]): Self = this.set("renewalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReservedSlots(value: Input[Double]): Self = this.set("reservedSlots", value.asInstanceOf[js.Any])
  }
  
}

