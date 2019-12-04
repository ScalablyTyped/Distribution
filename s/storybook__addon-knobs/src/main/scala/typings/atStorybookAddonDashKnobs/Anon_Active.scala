package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.emit
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.getQueryParam
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.off
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.on
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.setQueryParams
import typings.atStorybookApi.atStorybookApiMod.API
import typings.propDashTypes.propDashTypesMod.Validator
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: Validator[Boolean]
  var api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]]
  var onReset: Validator[js.UndefOr[js.Object]]
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Active]
  }
}

