package typings.storybookAddonKnobs.propFormMod

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropFormProps extends js.Object {
  var knobs: js.Array[KnobStoreKnob] = js.native
  def onFieldChange(changedKnob: KnobStoreKnob): Unit = js.native
  def onFieldClick(knob: KnobStoreKnob): Unit = js.native
}

object PropFormProps {
  @scala.inline
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Unit,
    onFieldClick: KnobStoreKnob => Unit
  ): PropFormProps = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1(onFieldChange), onFieldClick = js.Any.fromFunction1(onFieldClick))
    __obj.asInstanceOf[PropFormProps]
  }
  @scala.inline
  implicit class PropFormPropsOps[Self <: PropFormProps] (val x: Self) extends AnyVal {
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
    def setKnobsVarargs(value: KnobStoreKnob*): Self = this.set("knobs", js.Array(value :_*))
    @scala.inline
    def setKnobs(value: js.Array[KnobStoreKnob]): Self = this.set("knobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFieldChange(value: KnobStoreKnob => Unit): Self = this.set("onFieldChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFieldClick(value: KnobStoreKnob => Unit): Self = this.set("onFieldClick", js.Any.fromFunction1(value))
  }
  
}

