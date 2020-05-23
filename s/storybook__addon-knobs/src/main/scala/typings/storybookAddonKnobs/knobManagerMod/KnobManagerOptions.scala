package typings.storybookAddonKnobs.knobManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobManagerOptions extends js.Object {
  var disableDebounce: js.UndefOr[Boolean] = js.undefined
  var escapeHTML: js.UndefOr[Boolean] = js.undefined
}

object KnobManagerOptions {
  @scala.inline
  def apply(
    disableDebounce: js.UndefOr[Boolean] = js.undefined,
    escapeHTML: js.UndefOr[Boolean] = js.undefined
  ): KnobManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDebounce)) __obj.updateDynamic("disableDebounce")(disableDebounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeHTML)) __obj.updateDynamic("escapeHTML")(escapeHTML.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobManagerOptions]
  }
}

