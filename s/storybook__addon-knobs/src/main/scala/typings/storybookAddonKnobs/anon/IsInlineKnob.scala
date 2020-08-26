package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.radioMod.RadiosTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsInlineKnob extends js.Object {
  var isInline: Validator[Boolean] = js.native
  var knob: Validator[RadiosTypeKnob] = js.native
  var onChange: Validator[
    js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
  ] = js.native
}

object IsInlineKnob {
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[RadiosTypeKnob],
    onChange: Validator[
      js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
    ]
  ): IsInlineKnob = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInlineKnob]
  }
  @scala.inline
  implicit class IsInlineKnobOps[Self <: IsInlineKnob] (val x: Self) extends AnyVal {
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
    def setIsInline(value: Validator[Boolean]): Self = this.set("isInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setKnob(value: Validator[RadiosTypeKnob]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(
      value: Validator[
          js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
  }
  
}

