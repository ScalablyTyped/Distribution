package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodData extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var supportedMethods: java.lang.String | js.Array[java.lang.String]
}

object PaymentMethodData {
  @scala.inline
  def apply(supportedMethods: java.lang.String | js.Array[java.lang.String], data: js.Any = null): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
}

