package typings.atPulumiAws.typesOutputMod.budgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetNotification extends js.Object {
  /**
    * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
    */
  var comparisonOperator: String
  /**
    * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
    */
  var notificationType: String
  /**
    * (Optional) E-Mail addresses to notify. Either this or `subscriberSnsTopicArns` is required.
    */
  var subscriberEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Optional) SNS topics to notify. Either this or `subscriberEmailAddresses` is required.
    */
  var subscriberSnsTopicArns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Required) Threshold when the notification should be sent.
    */
  var threshold: Double
  /**
    * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
    */
  var thresholdType: String
}

object BudgetNotification {
  @scala.inline
  def apply(
    comparisonOperator: String,
    notificationType: String,
    threshold: Double,
    thresholdType: String,
    subscriberEmailAddresses: js.Array[String] = null,
    subscriberSnsTopicArns: js.Array[String] = null
  ): BudgetNotification = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, notificationType = notificationType, threshold = threshold, thresholdType = thresholdType)
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses)
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns)
    __obj.asInstanceOf[BudgetNotification]
  }
}

