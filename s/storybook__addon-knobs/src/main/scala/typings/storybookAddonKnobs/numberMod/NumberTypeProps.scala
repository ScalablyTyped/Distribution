package typings.storybookAddonKnobs.numberMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberTypeProps extends KnobControlProps[NumberTypeKnobValue | Null] {
  @JSName("knob")
  var knob_NumberTypeProps: NumberTypeKnob = js.native
}

object NumberTypeProps {
  @scala.inline
  def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): NumberTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[NumberTypeProps]
  }
  @scala.inline
  implicit class NumberTypePropsOps[Self <: NumberTypeProps] (val x: Self) extends AnyVal {
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
    def setKnob(value: NumberTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
  }
  
}

