package typings.soap.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault11 extends ISoapFault {
  var detail: js.UndefOr[String] = js.undefined
  var faultcode: Double | String
  var faultstring: String
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ISoapFault11 {
  @scala.inline
  def apply(
    faultcode: Double | String,
    faultstring: String,
    detail: String = null,
    statusCode: Int | Double = null
  ): ISoapFault11 = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault11]
  }
}

