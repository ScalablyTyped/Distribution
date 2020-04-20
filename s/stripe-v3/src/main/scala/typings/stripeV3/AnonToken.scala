package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToken extends js.Object {
  /*
    * Converts the provided token into a PaymentMethod to use for
    * confirmation.
    */
  var token: String
}

object AnonToken {
  @scala.inline
  def apply(token: String): AnonToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToken]
  }
}

