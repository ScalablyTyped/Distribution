package typings.storybookAddonKnobs

import typings.std.Record
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnobs extends js.Object {
  var knobs: Record[String, KnobStoreKnob]
  var timestamp: js.UndefOr[Double] = js.undefined
}

object AnonKnobs {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob], timestamp: Int | Double = null): AnonKnobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKnobs]
  }
}

