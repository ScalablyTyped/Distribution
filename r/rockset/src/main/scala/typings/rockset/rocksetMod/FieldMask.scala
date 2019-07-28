package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMask extends js.Object {
  var input_path: js.Array[String]
  var mask: js.UndefOr[FieldMaskMask] = js.undefined
}

object FieldMask {
  @scala.inline
  def apply(input_path: js.Array[String], mask: FieldMaskMask = null): FieldMask = {
    val __obj = js.Dynamic.literal(input_path = input_path)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[FieldMask]
  }
}

