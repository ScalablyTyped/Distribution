package typings.storybookAddonKnobs.numberMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberTypeKnob
  extends KnobControlConfig[NumberTypeKnobValue]
     with NumberTypeKnobOptions

object NumberTypeKnob {
  @scala.inline
  def apply(name: String, value: NumberTypeKnobValue): NumberTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnob]
  }
}

