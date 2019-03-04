package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var Code: Anon_Subcode
  var Reason: Anon_Text
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(Code: Anon_Subcode, Reason: Anon_Text, statusCode: scala.Int | scala.Double = null): Anon_Code = {
    val __obj = js.Dynamic.literal(Code = Code, Reason = Reason)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

