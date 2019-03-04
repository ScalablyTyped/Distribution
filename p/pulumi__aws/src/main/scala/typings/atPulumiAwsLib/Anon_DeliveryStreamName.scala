package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryStreamName extends js.Object {
  var deliveryStreamName: java.lang.String
  var roleArn: java.lang.String
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeliveryStreamName {
  @scala.inline
  def apply(
    deliveryStreamName: java.lang.String,
    roleArn: java.lang.String,
    separator: java.lang.String = null
  ): Anon_DeliveryStreamName = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName, roleArn = roleArn)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_DeliveryStreamName]
  }
}

