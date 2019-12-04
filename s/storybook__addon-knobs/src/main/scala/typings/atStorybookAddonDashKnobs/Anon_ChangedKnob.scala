package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distKnobStoreMod.KnobStoreKnob
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedKnob extends js.Object {
  var knobs: Validator[js.Array[KnobStoreKnob]]
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
}

object Anon_ChangedKnob {
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): Anon_ChangedKnob = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChangedKnob]
  }
}

