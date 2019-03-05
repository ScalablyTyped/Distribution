package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetailsModifier extends js.Object {
  var additionalDisplayItems: js.UndefOr[Array[PaymentItem]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var supportedMethods: java.lang.String | Array[java.lang.String]
  var total: js.UndefOr[PaymentItem] = js.undefined
}

object PaymentDetailsModifier {
  @scala.inline
  def apply(
    supportedMethods: java.lang.String | Array[java.lang.String],
    additionalDisplayItems: Array[PaymentItem] = null,
    data: js.Any = null,
    total: PaymentItem = null
  ): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    if (additionalDisplayItems != null) __obj.updateDynamic("additionalDisplayItems")(additionalDisplayItems)
    if (data != null) __obj.updateDynamic("data")(data)
    if (total != null) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
}

