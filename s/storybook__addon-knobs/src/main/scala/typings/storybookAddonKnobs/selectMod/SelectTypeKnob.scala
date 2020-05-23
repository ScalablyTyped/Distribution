package typings.storybookAddonKnobs.selectMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectTypeKnob[T /* <: SelectTypeKnobValue */] extends KnobControlConfig[T] {
  var options: SelectTypeOptionsProp[T]
}

object SelectTypeKnob {
  @scala.inline
  def apply[T](name: String, options: SelectTypeOptionsProp[T], value: T, defaultValue: T = null): SelectTypeKnob[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectTypeKnob[T]]
  }
}

