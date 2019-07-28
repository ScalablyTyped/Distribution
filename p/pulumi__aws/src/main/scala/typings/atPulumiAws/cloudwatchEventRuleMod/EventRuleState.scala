package typings.atPulumiAws.cloudwatchEventRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRuleState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Event pattern
    * described a JSON object.
    * See full documentation of [CloudWatch Events and Event Patterns](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CloudWatchEventsandEventPatterns.html) for details.
    */
  val eventPattern: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether the rule should be enabled (defaults to `true`).
    */
  val isEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The rule's name. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The scheduling expression.
    * For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`.
    */
  val scheduleExpression: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object EventRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    eventPattern: Input[String] = null,
    isEnabled: Input[Boolean] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    roleArn: Input[String] = null,
    scheduleExpression: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): EventRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (eventPattern != null) __obj.updateDynamic("eventPattern")(eventPattern.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (scheduleExpression != null) __obj.updateDynamic("scheduleExpression")(scheduleExpression.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRuleState]
  }
}

