package typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod

import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTypeProps[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlProps[T] {
  var display: OptionsKnobOptionsDisplay
  @JSName("knob")
  var knob_OptionsTypeProps: OptionsTypeKnob[T]
}

object OptionsTypeProps {
  @scala.inline
  def apply[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[T], onChange: T => T): OptionsTypeProps[T] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[OptionsTypeProps[T]]
  }
}

