package typings.storybookAddonKnobs.optionsMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTypeKnob[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlConfig[T] {
  var options: OptionsTypeOptionsProp[T] = js.native
  var optionsObj: OptionsKnobOptions = js.native
}

object OptionsTypeKnob {
  @scala.inline
  def apply[/* <: typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue[typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue] */ T](name: String, options: OptionsTypeOptionsProp[T], optionsObj: OptionsKnobOptions, value: T): OptionsTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTypeKnob[T]]
  }
  @scala.inline
  implicit class OptionsTypeKnobOps[Self <: OptionsTypeKnob[_], /* <: typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue[typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue] */ T] (val x: Self with OptionsTypeKnob[T]) extends AnyVal {
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
    def setOptions(value: OptionsTypeOptionsProp[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsObj(value: OptionsKnobOptions): Self = this.set("optionsObj", value.asInstanceOf[js.Any])
  }
  
}

