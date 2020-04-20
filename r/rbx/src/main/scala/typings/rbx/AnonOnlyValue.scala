package typings.rbx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: Boolean
}

object AnonOnlyValue {
  @scala.inline
  def apply(value: Boolean, only: js.UndefOr[Boolean] = js.undefined): AnonOnlyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyValue]
  }
}

