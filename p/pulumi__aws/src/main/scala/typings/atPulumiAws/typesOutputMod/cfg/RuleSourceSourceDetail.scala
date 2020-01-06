package typings.atPulumiAws.typesOutputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleSourceSourceDetail extends js.Object {
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config
    * to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
    */
  var eventSource: js.UndefOr[String] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  var maximumExecutionFrequency: js.UndefOr[String] = js.native
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
    */
  var messageType: js.UndefOr[String] = js.native
}

object RuleSourceSourceDetail {
  @scala.inline
  def apply(eventSource: String = null, maximumExecutionFrequency: String = null, messageType: String = null): RuleSourceSourceDetail = {
    val __obj = js.Dynamic.literal()
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSourceSourceDetail]
  }
}

