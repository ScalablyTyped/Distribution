package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHideLabel extends js.Object {
  var callback: ButtonTypeOnClickProp
  var hideLabel: `true`
}

object AnonHideLabel {
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => js.Any, hideLabel: `true`): AnonHideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = hideLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHideLabel]
  }
}

