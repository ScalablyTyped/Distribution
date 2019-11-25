package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerializeValueSelectTypeKnobValue extends js.Object {
  def deserialize(value: SelectTypeKnobValue): SelectTypeKnobValue
  def serialize(value: SelectTypeKnobValue): SelectTypeKnobValue
}

object Anon_DeserializeSerializeValueSelectTypeKnobValue {
  @scala.inline
  def apply(
    deserialize: SelectTypeKnobValue => SelectTypeKnobValue,
    serialize: SelectTypeKnobValue => SelectTypeKnobValue
  ): Anon_DeserializeSerializeValueSelectTypeKnobValue = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerializeValueSelectTypeKnobValue]
  }
}

