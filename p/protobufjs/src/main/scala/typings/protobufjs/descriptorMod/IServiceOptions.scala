package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceOptions extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.undefined
}

object IServiceOptions {
  @scala.inline
  def apply(deprecated: js.UndefOr[Boolean] = js.undefined): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceOptions]
  }
}

