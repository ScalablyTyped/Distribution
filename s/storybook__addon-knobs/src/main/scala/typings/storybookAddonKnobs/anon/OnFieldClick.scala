package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFieldClick extends js.Object {
  var knobs: Validator[js.Array[KnobStoreKnob]] = js.native
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]] = js.native
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]] = js.native
}

object OnFieldClick {
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): OnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFieldClick]
  }
  @scala.inline
  implicit class OnFieldClickOps[Self <: OnFieldClick] (val x: Self) extends AnyVal {
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
    def setKnobs(value: Validator[js.Array[KnobStoreKnob]]): Self = this.set("knobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFieldChange(value: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]): Self = this.set("onFieldChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFieldClick(value: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]): Self = this.set("onFieldClick", value.asInstanceOf[js.Any])
  }
  
}

