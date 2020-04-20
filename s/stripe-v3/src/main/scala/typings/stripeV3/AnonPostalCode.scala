package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostalCode extends js.Object {
  var postalCode: String | Double
}

object AnonPostalCode {
  @scala.inline
  def apply(postalCode: String | Double): AnonPostalCode = {
    val __obj = js.Dynamic.literal(postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostalCode]
  }
}

