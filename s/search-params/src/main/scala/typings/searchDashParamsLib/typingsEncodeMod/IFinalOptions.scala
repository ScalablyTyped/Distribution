package typings
package searchDashParamsLib.typingsEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalOptions extends js.Object {
  var arrayFormat: arrayFormat
  var booleanFormat: booleanFormat
  var nullFormat: nullFormat
}

object IFinalOptions {
  @scala.inline
  def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrayFormat")(arrayFormat)
    __obj.updateDynamic("booleanFormat")(booleanFormat)
    __obj.updateDynamic("nullFormat")(nullFormat)
    __obj.asInstanceOf[IFinalOptions]
  }
}

