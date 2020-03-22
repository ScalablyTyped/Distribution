package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingleBoolean extends js.Object {
  var single: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonSingleBoolean {
  @scala.inline
  def apply(single: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): AnonSingleBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingleBoolean]
  }
}

