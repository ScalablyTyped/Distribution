package typings.soap.libTypesMod

import typings.soap.Anon_Subcode
import typings.soap.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault12 extends ISoapFault {
  var Code: Anon_Subcode
  var Reason: Anon_Text
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ISoapFault12 {
  @scala.inline
  def apply(Code: Anon_Subcode, Reason: Anon_Text, statusCode: Int | Double = null): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
}

