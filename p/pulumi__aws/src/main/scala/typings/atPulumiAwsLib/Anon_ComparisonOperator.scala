package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperator extends js.Object {
  var comparisonOperator: java.lang.String
  var notificationType: java.lang.String
  var subscriberEmailAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subscriberSnsTopicArns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var threshold: scala.Double
  var thresholdType: java.lang.String
}

object Anon_ComparisonOperator {
  @scala.inline
  def apply(
    comparisonOperator: java.lang.String,
    notificationType: java.lang.String,
    threshold: scala.Double,
    thresholdType: java.lang.String,
    subscriberEmailAddresses: js.Array[java.lang.String] = null,
    subscriberSnsTopicArns: js.Array[java.lang.String] = null
  ): Anon_ComparisonOperator = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator, notificationType = notificationType, threshold = threshold, thresholdType = thresholdType)
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses)
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns)
    __obj.asInstanceOf[Anon_ComparisonOperator]
  }
}

