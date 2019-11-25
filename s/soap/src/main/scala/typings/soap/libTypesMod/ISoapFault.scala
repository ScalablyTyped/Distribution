package typings.soap.libTypesMod

import typings.soap.Anon_Subcode
import typings.soap.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.soap.libTypesMod.ISoapFault11
  - typings.soap.libTypesMod.ISoapFault12
*/
trait ISoapFault extends js.Object

object ISoapFault {
  @scala.inline
  def ISoapFault11(
    faultcode: Double | String,
    faultstring: String,
    detail: String = null,
    statusCode: Int | Double = null
  ): ISoapFault = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault]
  }
  @scala.inline
  def ISoapFault12(Code: Anon_Subcode, Reason: Anon_Text, statusCode: Int | Double = null): ISoapFault = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault]
  }
}

