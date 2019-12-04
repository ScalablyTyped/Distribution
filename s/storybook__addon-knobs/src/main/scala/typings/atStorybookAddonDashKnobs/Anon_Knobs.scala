package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distKnobStoreMod.KnobStoreKnob
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Knobs extends js.Object {
  var knobs: Record[String, KnobStoreKnob]
  var timestamp: js.UndefOr[Double] = js.undefined
}

object Anon_Knobs {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob], timestamp: Int | Double = null): Anon_Knobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Knobs]
  }
}

