package typings.storybookAddonKnobs.dateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTypeState extends js.Object {
  var valid: js.UndefOr[Boolean] = js.undefined
}

object DateTypeState {
  @scala.inline
  def apply(valid: js.UndefOr[Boolean] = js.undefined): DateTypeState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTypeState]
  }
}

