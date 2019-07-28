package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperator extends js.Object {
  var comparisonOperator: String
  var notificationType: String
  var subscriberEmailAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var subscriberSnsTopicArns: js.UndefOr[js.Array[String]] = js.undefined
  var threshold: Double
  var thresholdType: String
}

object Anon_ComparisonOperator {
  @scala.inline
  def apply(
    comparisonOperator: String,
    notificationType: String,
    threshold: Double,
    thresholdType: String,
    subscriberEmailAddresses: js.Array[String] = null,
    subscriberSnsTopicArns: js.Array[String] = null
  ): Anon_ComparisonOperator = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, notificationType = notificationType, threshold = threshold, thresholdType = thresholdType)
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses)
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns)
    __obj.asInstanceOf[Anon_ComparisonOperator]
  }
}

