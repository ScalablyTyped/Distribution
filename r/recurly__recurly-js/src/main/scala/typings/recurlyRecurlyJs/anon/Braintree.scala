package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Braintree extends js.Object {
  var braintree: js.UndefOr[DeviceData] = js.undefined
  var kount: js.UndefOr[DataCollector] = js.undefined
  var litle: js.UndefOr[SessionId] = js.undefined
}

object Braintree {
  @scala.inline
  def apply(braintree: DeviceData = null, kount: DataCollector = null, litle: SessionId = null): Braintree = {
    val __obj = js.Dynamic.literal()
    if (braintree != null) __obj.updateDynamic("braintree")(braintree.asInstanceOf[js.Any])
    if (kount != null) __obj.updateDynamic("kount")(kount.asInstanceOf[js.Any])
    if (litle != null) __obj.updateDynamic("litle")(litle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Braintree]
  }
}

