package typings.protobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumOptions extends js.Object {
  var allowAlias: js.UndefOr[Boolean] = js.undefined
  var deprecated: js.UndefOr[Boolean] = js.undefined
}

object IEnumOptions {
  @scala.inline
  def apply(allowAlias: js.UndefOr[Boolean] = js.undefined, deprecated: js.UndefOr[Boolean] = js.undefined): IEnumOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAlias)) __obj.updateDynamic("allowAlias")(allowAlias.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumOptions]
  }
}

