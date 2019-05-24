package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault12 extends ISoapFault {
  var Code: soapLib.Anon_Subcode
  var Reason: soapLib.Anon_Text
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object ISoapFault12 {
  @scala.inline
  def apply(Code: soapLib.Anon_Subcode, Reason: soapLib.Anon_Text, statusCode: scala.Int | scala.Double = null): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code, Reason = Reason)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
}

