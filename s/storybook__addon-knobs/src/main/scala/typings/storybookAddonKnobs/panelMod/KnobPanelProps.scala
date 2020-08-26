package typings.storybookAddonKnobs.panelMod

import typings.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobPanelProps extends js.Object {
  var active: Boolean = js.native
  var api: PickAPIonoffemitgetQueryP = js.native
  var onReset: js.UndefOr[js.Object] = js.native
}

object KnobPanelProps {
  @scala.inline
  def apply(active: Boolean, api: PickAPIonoffemitgetQueryP): KnobPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelProps]
  }
  @scala.inline
  implicit class KnobPanelPropsOps[Self <: KnobPanelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi(value: PickAPIonoffemitgetQueryP): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReset(value: js.Object): Self = this.set("onReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
  }
  
}

