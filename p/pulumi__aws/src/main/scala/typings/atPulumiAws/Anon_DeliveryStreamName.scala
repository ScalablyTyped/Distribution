package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryStreamName extends js.Object {
  var deliveryStreamName: String
  var roleArn: String
  var separator: js.UndefOr[String] = js.undefined
}

object Anon_DeliveryStreamName {
  @scala.inline
  def apply(deliveryStreamName: String, roleArn: String, separator: String = null): Anon_DeliveryStreamName = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName, roleArn = roleArn)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_DeliveryStreamName]
  }
}

