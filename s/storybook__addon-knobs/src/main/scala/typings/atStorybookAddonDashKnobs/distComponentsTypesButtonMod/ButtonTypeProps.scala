package typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTypeProps
  extends KnobControlProps[scala.Nothing] {
  @JSName("knob")
  var knob_ButtonTypeProps: ButtonTypeKnob
  var onClick: ButtonTypeOnClickProp
}

object ButtonTypeProps {
  @scala.inline
  def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => js.Any): ButtonTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[ButtonTypeProps]
  }
}

