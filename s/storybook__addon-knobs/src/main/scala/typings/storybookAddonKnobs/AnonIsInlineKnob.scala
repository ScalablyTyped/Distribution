package typings.storybookAddonKnobs

import typings.react.mod.Validator
import typings.storybookAddonKnobs.radioMod.RadiosTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsInlineKnob extends js.Object {
  var isInline: Validator[Boolean]
  var knob: Validator[RadiosTypeKnob]
  var onChange: Validator[
    js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
  ]
}

object AnonIsInlineKnob {
  @scala.inline
  def apply(
    isInline: Validator[Boolean],
    knob: Validator[RadiosTypeKnob],
    onChange: Validator[
      js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
    ]
  ): AnonIsInlineKnob = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsInlineKnob]
  }
}

