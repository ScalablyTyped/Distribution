package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCvv extends js.Object {
  var cvv: js.UndefOr[String] = js.undefined
  var expiry: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
}

object AnonCvv {
  @scala.inline
  def apply(cvv: String = null, expiry: String = null, number: String = null): AnonCvv = {
    val __obj = js.Dynamic.literal()
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCvv]
  }
}

