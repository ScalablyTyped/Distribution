package typings.soap.typesMod

import typings.soap.AnonSubcode
import typings.soap.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault12 extends ISoapFault {
  var Code: AnonSubcode
  var Reason: AnonText
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ISoapFault12 {
  @scala.inline
  def apply(Code: AnonSubcode, Reason: AnonText, statusCode: Int | Double = null): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
}

