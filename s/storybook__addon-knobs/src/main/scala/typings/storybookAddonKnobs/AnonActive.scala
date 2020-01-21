package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.std.Pick
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.emit
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.getQueryParam
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.off
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.on
import typings.storybookAddonKnobs.storybookAddonKnobsStrings.setQueryParams
import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: Validator[Boolean]
  var api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]]
  var onReset: Validator[js.UndefOr[js.Object]]
}

object AnonActive {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]],
    onReset: Validator[js.UndefOr[js.Object]]
  ): AnonActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActive]
  }
}

