package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`inline-check`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`inline-radio`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`multi-select`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.check
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.radio
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsKnobOptions extends js.Object {
  var display: js.UndefOr[radio | `inline-radio` | check | `inline-check` | select | `multi-select`] = js.undefined
}

object OptionsKnobOptions {
  @scala.inline
  def apply(display: radio | `inline-radio` | check | `inline-check` | select | `multi-select` = null): OptionsKnobOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsKnobOptions]
  }
}

