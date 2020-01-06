package typings.atPulumiAws.typesInputMod.budgets

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BudgetNotification extends js.Object {
  /**
    * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
    */
  var comparisonOperator: Input[String] = js.native
  /**
    * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
    */
  var notificationType: Input[String] = js.native
  /**
    * (Optional) E-Mail addresses to notify. Either this or `subscriberSnsTopicArns` is required.
    */
  var subscriberEmailAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * (Optional) SNS topics to notify. Either this or `subscriberEmailAddresses` is required.
    */
  var subscriberSnsTopicArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * (Required) Threshold when the notification should be sent.
    */
  var threshold: Input[Double] = js.native
  /**
    * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
    */
  var thresholdType: Input[String] = js.native
}

object BudgetNotification {
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    notificationType: Input[String],
    threshold: Input[Double],
    thresholdType: Input[String],
    subscriberEmailAddresses: Input[js.Array[Input[String]]] = null,
    subscriberSnsTopicArns: Input[js.Array[Input[String]]] = null
  ): BudgetNotification = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses.asInstanceOf[js.Any])
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BudgetNotification]
  }
}

