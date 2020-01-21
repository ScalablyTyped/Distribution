package typings.reactPhoneNumberInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  var disable: js.UndefOr[Boolean] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
}

object AnonDisable {
  @scala.inline
  def apply(disable: js.UndefOr[Boolean] = js.undefined, invalid: js.UndefOr[Boolean] = js.undefined): AnonDisable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisable]
  }
}

