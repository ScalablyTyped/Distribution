package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBraintree extends js.Object {
  var braintree: js.UndefOr[AnonDeviceData] = js.undefined
  var kount: js.UndefOr[AnonDataCollector] = js.undefined
  var litle: js.UndefOr[AnonSessionId] = js.undefined
}

object AnonBraintree {
  @scala.inline
  def apply(braintree: AnonDeviceData = null, kount: AnonDataCollector = null, litle: AnonSessionId = null): AnonBraintree = {
    val __obj = js.Dynamic.literal()
    if (braintree != null) __obj.updateDynamic("braintree")(braintree.asInstanceOf[js.Any])
    if (kount != null) __obj.updateDynamic("kount")(kount.asInstanceOf[js.Any])
    if (litle != null) __obj.updateDynamic("litle")(litle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBraintree]
  }
}

