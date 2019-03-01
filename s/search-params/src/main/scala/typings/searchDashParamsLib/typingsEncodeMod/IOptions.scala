package typings
package searchDashParamsLib.typingsEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var arrayFormat: js.UndefOr[arrayFormat] = js.undefined
  var booleanFormat: js.UndefOr[booleanFormat] = js.undefined
  var nullFormat: js.UndefOr[nullFormat] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    arrayFormat: arrayFormat = null,
    booleanFormat: booleanFormat = null,
    nullFormat: nullFormat = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat)
    if (booleanFormat != null) __obj.updateDynamic("booleanFormat")(booleanFormat)
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat)
    __obj.asInstanceOf[IOptions]
  }
}

