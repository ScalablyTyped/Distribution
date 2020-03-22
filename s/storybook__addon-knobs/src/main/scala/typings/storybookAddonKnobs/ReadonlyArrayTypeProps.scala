package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
trait ReadonlyArrayTypeProps extends js.Object {
  val knob: ArrayTypeKnob
  val onChange: js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]
}

object ReadonlyArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: /* value */ ArrayTypeKnobValue => ArrayTypeKnobValue): ReadonlyArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[ReadonlyArrayTypeProps]
  }
}

