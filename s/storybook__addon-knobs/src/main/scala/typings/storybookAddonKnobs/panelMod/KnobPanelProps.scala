package typings.storybookAddonKnobs.panelMod

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

trait KnobPanelProps extends js.Object {
  var active: Boolean
  var api: Pick[API, on | off | emit | getQueryParam | setQueryParams]
  var onReset: js.UndefOr[js.Object] = js.undefined
}

object KnobPanelProps {
  @scala.inline
  def apply(
    active: Boolean,
    api: Pick[API, on | off | emit | getQueryParam | setQueryParams],
    onReset: js.Object = null
  ): KnobPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelProps]
  }
}

