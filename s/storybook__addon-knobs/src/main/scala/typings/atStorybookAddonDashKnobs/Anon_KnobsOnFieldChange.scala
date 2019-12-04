package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distKnobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KnobsOnFieldChange extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(): Unit
  def onFieldClick(): Unit
}

object Anon_KnobsOnFieldChange {
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): Anon_KnobsOnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
  
    __obj.asInstanceOf[Anon_KnobsOnFieldChange]
  }
}

