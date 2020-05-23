package typings.storybookAddonKnobs.anon

import typings.std.Record
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Knobs extends js.Object {
  var knobs: Record[String, KnobStoreKnob]
  var timestamp: js.UndefOr[Double] = js.undefined
}

object Knobs {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob], timestamp: js.UndefOr[Double] = js.undefined): Knobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knobs]
  }
}

