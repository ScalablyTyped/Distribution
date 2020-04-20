package typings.searchParams.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalOptions extends js.Object {
  var arrayFormat: typings.searchParams.encodeMod.arrayFormat
  var booleanFormat: typings.searchParams.encodeMod.booleanFormat
  var nullFormat: typings.searchParams.encodeMod.nullFormat
}

object IFinalOptions {
  @scala.inline
  def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
    val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFinalOptions]
  }
}

