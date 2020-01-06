package typings.atPulumiAws.redshiftEventSubscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscriptionState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  val customerAwsId: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean flag to enable/disable the subscription. Defaults to true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
    */
  val eventCategories: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the Redshift event subscription.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
    */
  val severity: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the SNS topic to send events to.
    */
  val snsTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a sourceType must also be specified.
    */
  val sourceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
    */
  val sourceType: js.UndefOr[Input[String]] = js.native
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object EventSubscriptionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    customerAwsId: Input[String] = null,
    enabled: Input[Boolean] = null,
    eventCategories: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    severity: Input[String] = null,
    snsTopicArn: Input[String] = null,
    sourceIds: Input[js.Array[Input[String]]] = null,
    sourceType: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): EventSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (customerAwsId != null) __obj.updateDynamic("customerAwsId")(customerAwsId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (eventCategories != null) __obj.updateDynamic("eventCategories")(eventCategories.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    if (sourceIds != null) __obj.updateDynamic("sourceIds")(sourceIds.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscriptionState]
  }
}

