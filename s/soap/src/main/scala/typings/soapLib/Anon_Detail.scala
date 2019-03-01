package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail extends js.Object {
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var faultcode: scala.Double | java.lang.String
  var faultstring: java.lang.String
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Detail {
  @scala.inline
  def apply(
    faultcode: scala.Double | java.lang.String,
    faultstring: java.lang.String,
    detail: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null
  ): Anon_Detail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("faultcode")(faultcode.asInstanceOf[js.Any])
    __obj.updateDynamic("faultstring")(faultstring)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Detail]
  }
}

