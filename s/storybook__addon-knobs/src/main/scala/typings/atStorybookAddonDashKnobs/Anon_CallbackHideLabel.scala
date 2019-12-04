package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsNumbers.`true`
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeKnob
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackHideLabel extends js.Object {
  var callback: ButtonTypeOnClickProp
  var hideLabel: `true`
}

object Anon_CallbackHideLabel {
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => js.Any, hideLabel: `true`): Anon_CallbackHideLabel = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), hideLabel = hideLabel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CallbackHideLabel]
  }
}

