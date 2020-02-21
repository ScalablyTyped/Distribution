package typings.pulumiAws.notificationRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationRuleState extends js.Object {
  /**
    * The codestar notification rule ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
    */
  val detailType: js.UndefOr[Input[String]] = js.native
  /**
    * A list of event types associated with this notification rule.
    * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
    */
  val eventTypeIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of notification rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the resource to associate with the notification rule.
    */
  val resource: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the notification rule. Possible balues are `ENABLED` and `DISABLED`, default is `ENABLED`.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
    */
  val targets: js.UndefOr[Input[js.Array[Input[NotificationRuleTarget]]]] = js.native
}

object NotificationRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    detailType: Input[String] = null,
    eventTypeIds: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    resource: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    targets: Input[js.Array[Input[NotificationRuleTarget]]] = null
  ): NotificationRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (detailType != null) __obj.updateDynamic("detailType")(detailType.asInstanceOf[js.Any])
    if (eventTypeIds != null) __obj.updateDynamic("eventTypeIds")(eventTypeIds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationRuleState]
  }
}

