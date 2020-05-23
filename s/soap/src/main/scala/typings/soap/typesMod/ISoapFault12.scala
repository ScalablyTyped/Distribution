package typings.soap.typesMod

import typings.soap.anon.Subcode
import typings.soap.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault12 extends ISoapFault {
  var Code: Subcode
  var Reason: Text
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ISoapFault12 {
  @scala.inline
  def apply(Code: Subcode, Reason: Text, statusCode: js.UndefOr[Double] = js.undefined): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
}

