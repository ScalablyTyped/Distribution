package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFieldChange extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(): Unit
  def onFieldClick(): Unit
}

object AnonOnFieldChange {
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): AnonOnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
  
    __obj.asInstanceOf[AnonOnFieldChange]
  }
}

