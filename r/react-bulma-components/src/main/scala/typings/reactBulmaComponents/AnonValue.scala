package typings.reactBulmaComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Boolean] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(only: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Boolean] = js.undefined): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

