package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryFrequency extends js.Object {
  var deliveryFrequency: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeliveryFrequency {
  @scala.inline
  def apply(deliveryFrequency: java.lang.String = null): Anon_DeliveryFrequency = {
    val __obj = js.Dynamic.literal()
    if (deliveryFrequency != null) __obj.updateDynamic("deliveryFrequency")(deliveryFrequency)
    __obj.asInstanceOf[Anon_DeliveryFrequency]
  }
}

