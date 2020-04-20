package typings.storybookAddonKnobs.checkboxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxesTypeState extends js.Object {
  var values: CheckboxesTypeKnobValue
}

object CheckboxesTypeState {
  @scala.inline
  def apply(values: CheckboxesTypeKnobValue): CheckboxesTypeState = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxesTypeState]
  }
}

