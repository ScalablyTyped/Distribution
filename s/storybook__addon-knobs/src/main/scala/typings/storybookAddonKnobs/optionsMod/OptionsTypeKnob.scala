package typings.storybookAddonKnobs.optionsMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTypeKnob[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlConfig[T] {
  var options: OptionsTypeOptionsProp[T]
  var optionsObj: OptionsKnobOptions
}

object OptionsTypeKnob {
  @scala.inline
  def apply[T](
    name: String,
    options: OptionsTypeOptionsProp[T],
    optionsObj: OptionsKnobOptions,
    value: T,
    defaultValue: T = null
  ): OptionsTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTypeKnob[T]]
  }
}

