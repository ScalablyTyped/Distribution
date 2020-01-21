package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeValueSelectTypeKnobValue extends js.Object {
  def deserialize(value: SelectTypeKnobValue): SelectTypeKnobValue
  def serialize(value: SelectTypeKnobValue): SelectTypeKnobValue
}

object AnonDeserializeSerializeValueSelectTypeKnobValue {
  @scala.inline
  def apply(
    deserialize: SelectTypeKnobValue => SelectTypeKnobValue,
    serialize: SelectTypeKnobValue => SelectTypeKnobValue
  ): AnonDeserializeSerializeValueSelectTypeKnobValue = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonDeserializeSerializeValueSelectTypeKnobValue]
  }
}

