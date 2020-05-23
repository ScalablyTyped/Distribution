package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.FileTypeKnob, 'value' | 'accept'> */
trait PickFileTypeKnobvalueacce extends js.Object {
  var accept: String
  var value: DateTypeKnobValue
}

object PickFileTypeKnobvalueacce {
  @scala.inline
  def apply(accept: String, value: DateTypeKnobValue): PickFileTypeKnobvalueacce = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFileTypeKnobvalueacce]
  }
}

