package typings.storybookAddonKnobs.optionsMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTypeProps[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlProps[T] {
  var display: OptionsKnobOptionsDisplay = js.native
  @JSName("knob")
  var knob_OptionsTypeProps: OptionsTypeKnob[T] = js.native
}

object OptionsTypeProps {
  @scala.inline
  def apply[/* <: typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue[typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue] */ T](display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[T], onChange: T => T): OptionsTypeProps[T] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OptionsTypeProps[T]]
  }
  @scala.inline
  implicit class OptionsTypePropsOps[Self <: OptionsTypeProps[_], /* <: typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue[typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue] */ T] (val x: Self with OptionsTypeProps[T]) extends AnyVal {
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
    def setDisplay(value: OptionsKnobOptionsDisplay): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setKnob(value: OptionsTypeKnob[T]): Self = this.set("knob", value.asInstanceOf[js.Any])
  }
  
}

