package typings.storybookAddonKnobs.panelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobPanelOptions extends js.Object {
  var timestamps: js.UndefOr[Boolean] = js.undefined
}

object KnobPanelOptions {
  @scala.inline
  def apply(timestamps: js.UndefOr[Boolean] = js.undefined): KnobPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelOptions]
  }
}

