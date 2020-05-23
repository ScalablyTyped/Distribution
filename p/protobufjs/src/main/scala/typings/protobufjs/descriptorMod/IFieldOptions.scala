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
  def apply(jstype: js.UndefOr[IFieldOptionsJSType] = js.undefined, packed: js.UndefOr[Boolean] = js.undefined): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jstype)) __obj.updateDynamic("jstype")(jstype.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldOptions]
  }
}

