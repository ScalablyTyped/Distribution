package typings.pulumiAws.redshiftEventSubscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscriptionArgs extends js.Object {
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
  val snsTopicArn: Input[String] = js.native
  /**
    * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a sourceType must also be specified.
    */
  val sourceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
    */
  val sourceType: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object EventSubscriptionArgs {
  @scala.inline
  def apply(snsTopicArn: Input[String]): EventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscriptionArgs]
  }
  @scala.inline
  implicit class EventSubscriptionArgsOps[Self <: EventSubscriptionArgs] (val x: Self) extends AnyVal {
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
    def setSnsTopicArn(value: Input[String]): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEventCategoriesVarargs(value: Input[String]*): Self = this.set("eventCategories", js.Array(value :_*))
    @scala.inline
    def setEventCategories(value: Input[js.Array[Input[String]]]): Self = this.set("eventCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategories: Self = this.set("eventCategories", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSeverity(value: Input[String]): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSourceIdsVarargs(value: Input[String]*): Self = this.set("sourceIds", js.Array(value :_*))
    @scala.inline
    def setSourceIds(value: Input[js.Array[Input[String]]]): Self = this.set("sourceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIds: Self = this.set("sourceIds", js.undefined)
    @scala.inline
    def setSourceType(value: Input[String]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

