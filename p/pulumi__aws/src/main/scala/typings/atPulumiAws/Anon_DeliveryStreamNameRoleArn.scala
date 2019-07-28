package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryStreamNameRoleArn extends js.Object {
  var deliveryStreamName: Input[String]
  var roleArn: Input[String]
  var separator: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeliveryStreamNameRoleArn {
  @scala.inline
  def apply(deliveryStreamName: Input[String], roleArn: Input[String], separator: Input[String] = null): Anon_DeliveryStreamNameRoleArn = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeliveryStreamNameRoleArn]
  }
}

