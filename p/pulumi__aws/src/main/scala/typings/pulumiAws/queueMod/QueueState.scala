package typings.pulumiAws.queueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mediaconvert.QueueReservationPlanSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueState extends js.Object {
  /**
    * The Arn of the queue
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the queue
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A unique identifier describing the queue
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
    */
  val pricingPlan: js.UndefOr[Input[String]] = js.native
  /**
    * A detail pricing plan of the  reserved queue. See below.
    */
  val reservationPlanSettings: js.UndefOr[Input[QueueReservationPlanSettings]] = js.native
  /**
    * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object QueueState {
  @scala.inline
  def apply(): QueueState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueState]
  }
  @scala.inline
  implicit class QueueStateOps[Self <: QueueState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPricingPlan(value: Input[String]): Self = this.set("pricingPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingPlan: Self = this.set("pricingPlan", js.undefined)
    @scala.inline
    def setReservationPlanSettings(value: Input[QueueReservationPlanSettings]): Self = this.set("reservationPlanSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservationPlanSettings: Self = this.set("reservationPlanSettings", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

