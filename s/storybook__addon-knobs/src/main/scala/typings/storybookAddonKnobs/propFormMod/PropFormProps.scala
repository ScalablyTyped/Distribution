package typings.storybookAddonKnobs.propFormMod

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropFormProps extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(changedKnob: KnobStoreKnob): Unit
  def onFieldClick(knob: KnobStoreKnob): Unit
}

object PropFormProps {
  @scala.inline
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Unit,
    onFieldClick: KnobStoreKnob => Unit
  ): PropFormProps = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1(onFieldChange), onFieldClick = js.Any.fromFunction1(onFieldClick))
    __obj.asInstanceOf[PropFormProps]
  }
}

