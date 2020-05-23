package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFieldChange extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(): Unit
  def onFieldClick(): Unit
}

object OnFieldChange {
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): OnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
    __obj.asInstanceOf[OnFieldChange]
  }
}

