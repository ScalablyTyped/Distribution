package typings.storybookAddonKnobs.anon

import typings.std.Record
import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knobs extends js.Object {
  var knobs: Record[String, KnobStoreKnob] = js.native
  var timestamp: js.UndefOr[Double] = js.native
}

object Knobs {
  @scala.inline
  def apply(knobs: Record[String, KnobStoreKnob]): Knobs = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knobs]
  }
  @scala.inline
  implicit class KnobsOps[Self <: Knobs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKnobs(value: Record[String, KnobStoreKnob]): Self = this.set("knobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

