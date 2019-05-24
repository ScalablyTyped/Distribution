package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault11 extends ISoapFault {
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var faultcode: scala.Double | java.lang.String
  var faultstring: java.lang.String
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object ISoapFault11 {
  @scala.inline
  def apply(
    faultcode: scala.Double | java.lang.String,
    faultstring: java.lang.String,
    detail: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null
  ): ISoapFault11 = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault11]
  }
}

