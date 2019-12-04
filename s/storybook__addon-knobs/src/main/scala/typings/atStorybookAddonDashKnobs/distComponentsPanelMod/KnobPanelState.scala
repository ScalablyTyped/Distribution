package typings.atStorybookAddonDashKnobs.distComponentsPanelMod

import typings.atStorybookAddonDashKnobs.distKnobStoreMod.KnobStoreKnob
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobPanelState extends js.Object {
  var knobs: Record[String, KnobStoreKnob]
}

object KnobPanelState {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob]): KnobPanelState = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnobPanelState]
  }
}

