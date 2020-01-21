package typings.reactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeclinecode extends js.Object {
  var decline_code: js.UndefOr[String] = js.undefined
}

object AnonDeclinecode {
  @scala.inline
  def apply(decline_code: String = null): AnonDeclinecode = {
    val __obj = js.Dynamic.literal()
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclinecode]
  }
}

