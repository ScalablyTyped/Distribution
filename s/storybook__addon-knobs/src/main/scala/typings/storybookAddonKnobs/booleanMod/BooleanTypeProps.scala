package typings.storybookAddonKnobs.booleanMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanTypeProps extends KnobControlProps[BooleanTypeKnobValue] {
  @JSName("knob")
  var knob_BooleanTypeProps: BooleanTypeKnob = js.native
}

object BooleanTypeProps {
  @scala.inline
  def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): BooleanTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[BooleanTypeProps]
  }
  @scala.inline
  implicit class BooleanTypePropsOps[Self <: BooleanTypeProps] (val x: Self) extends AnyVal {
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
    def setKnob(value: BooleanTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
  }
  
}

