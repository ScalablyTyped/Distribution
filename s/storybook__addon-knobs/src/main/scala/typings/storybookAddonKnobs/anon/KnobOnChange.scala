package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobOnChange extends js.Object {
  var knob: Validator[KnobControlConfig[Double]] = js.native
  var onChange: Validator[js.Function1[/* value */ Double, Double]] = js.native
}

object KnobOnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): KnobOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobOnChange]
  }
  @scala.inline
  implicit class KnobOnChangeOps[Self <: KnobOnChange] (val x: Self) extends AnyVal {
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
    def setKnob(value: Validator[KnobControlConfig[Double]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Validator[js.Function1[/* value */ Double, Double]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
  }
  
}

