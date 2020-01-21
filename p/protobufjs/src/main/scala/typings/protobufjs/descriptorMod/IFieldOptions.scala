package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldOptions extends js.Object {
  var jstype: js.UndefOr[IFieldOptionsJSType] = js.undefined
  var packed: js.UndefOr[Boolean] = js.undefined
}

object IFieldOptions {
  @scala.inline
  def apply(jstype: Int | Double = null, packed: js.UndefOr[Boolean] = js.undefined): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (jstype != null) __obj.updateDynamic("jstype")(jstype.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldOptions]
  }
}

