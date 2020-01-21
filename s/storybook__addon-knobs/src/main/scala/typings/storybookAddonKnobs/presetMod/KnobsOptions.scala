package typings.storybookAddonKnobs.presetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobsOptions extends js.Object {
  var addDecorator: js.UndefOr[Boolean] = js.undefined
}

object KnobsOptions {
  @scala.inline
  def apply(addDecorator: js.UndefOr[Boolean] = js.undefined): KnobsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addDecorator)) __obj.updateDynamic("addDecorator")(addDecorator.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobsOptions]
  }
}

