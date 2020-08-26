package typings.storybookAddonKnobs.panelMod

import typings.std.Record
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobPanelState extends js.Object {
  var knobs: Record[String, KnobStoreKnob] = js.native
}

object KnobPanelState {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob]): KnobPanelState = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobPanelState]
  }
  @scala.inline
  implicit class KnobPanelStateOps[Self <: KnobPanelState] (val x: Self) extends AnyVal {
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
    def setKnobs(value: Record[String, KnobStoreKnob]): Self = this.set("knobs", value.asInstanceOf[js.Any])
  }
  
}

