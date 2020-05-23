package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cvv extends js.Object {
  var cvv: js.UndefOr[String] = js.undefined
  var expiry: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
}

object Cvv {
  @scala.inline
  def apply(cvv: String = null, expiry: String = null, number: String = null): Cvv = {
    val __obj = js.Dynamic.literal()
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvv]
  }
}

