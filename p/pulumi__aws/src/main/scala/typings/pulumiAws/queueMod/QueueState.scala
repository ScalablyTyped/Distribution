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
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object QueueState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    pricingPlan: Input[String] = null,
    reservationPlanSettings: Input[QueueReservationPlanSettings] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): QueueState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pricingPlan != null) __obj.updateDynamic("pricingPlan")(pricingPlan.asInstanceOf[js.Any])
    if (reservationPlanSettings != null) __obj.updateDynamic("reservationPlanSettings")(reservationPlanSettings.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueState]
  }
}

