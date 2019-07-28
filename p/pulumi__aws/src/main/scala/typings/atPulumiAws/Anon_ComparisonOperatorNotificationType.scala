package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorNotificationType extends js.Object {
  var comparisonOperator: Input[String]
  var notificationType: Input[String]
  var subscriberEmailAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var subscriberSnsTopicArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var threshold: Input[Double]
  var thresholdType: Input[String]
}

object Anon_ComparisonOperatorNotificationType {
  @scala.inline
  def apply(
    comparisonOperator: Input[String],
    notificationType: Input[String],
    threshold: Input[Double],
    thresholdType: Input[String],
    subscriberEmailAddresses: Input[js.Array[Input[String]]] = null,
    subscriberSnsTopicArns: Input[js.Array[Input[String]]] = null
  ): Anon_ComparisonOperatorNotificationType = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses.asInstanceOf[js.Any])
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComparisonOperatorNotificationType]
  }
}

