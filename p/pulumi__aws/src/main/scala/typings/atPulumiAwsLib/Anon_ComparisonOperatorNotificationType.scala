package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparisonOperatorNotificationType extends js.Object {
  var comparisonOperator: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var subscriberEmailAddresses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var subscriberSnsTopicArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var threshold: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var thresholdType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ComparisonOperatorNotificationType {
  @scala.inline
  def apply(
    comparisonOperator: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    notificationType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    threshold: atPulumiPulumiLib.outputMod.Input[scala.Double],
    thresholdType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subscriberEmailAddresses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    subscriberSnsTopicArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_ComparisonOperatorNotificationType = {
    val __obj = js.Dynamic.literal(comparisonOperator = comparisonOperator.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], thresholdType = thresholdType.asInstanceOf[js.Any])
    if (subscriberEmailAddresses != null) __obj.updateDynamic("subscriberEmailAddresses")(subscriberEmailAddresses.asInstanceOf[js.Any])
    if (subscriberSnsTopicArns != null) __obj.updateDynamic("subscriberSnsTopicArns")(subscriberSnsTopicArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComparisonOperatorNotificationType]
  }
}

