package typings.storybookAddonKnobs.panelMod

import typings.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobPanelProps extends js.Object {
  var active: Boolean
  var api: PickAPIonoffemitgetQueryP
  var onReset: js.UndefOr[js.Object] = js.undefined
}

object KnobPanelProps {
  @scala.inline
  def apply(active: Boolean, api: PickAPIonoffemitgetQueryP, onReset: js.Object = null): KnobPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelProps]
  }
}

