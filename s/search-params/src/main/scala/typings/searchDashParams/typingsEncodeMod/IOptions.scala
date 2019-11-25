package typings.searchDashParams.typingsEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var arrayFormat: js.UndefOr[typings.searchDashParams.typingsEncodeMod.arrayFormat] = js.undefined
  var booleanFormat: js.UndefOr[typings.searchDashParams.typingsEncodeMod.booleanFormat] = js.undefined
  var nullFormat: js.UndefOr[typings.searchDashParams.typingsEncodeMod.nullFormat] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    arrayFormat: arrayFormat = null,
    booleanFormat: booleanFormat = null,
    nullFormat: nullFormat = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (booleanFormat != null) __obj.updateDynamic("booleanFormat")(booleanFormat.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

