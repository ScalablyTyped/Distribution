package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryStreamNameRoleArn extends js.Object {
  var deliveryStreamName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var separator: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeliveryStreamNameRoleArn {
  @scala.inline
  def apply(
    deliveryStreamName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    separator: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DeliveryStreamNameRoleArn = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeliveryStreamNameRoleArn]
  }
}

