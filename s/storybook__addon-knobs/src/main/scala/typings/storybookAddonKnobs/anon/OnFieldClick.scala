package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFieldClick extends js.Object {
  var knobs: Validator[js.Array[KnobStoreKnob]]
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
}

object OnFieldClick {
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): OnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFieldClick]
  }
}

