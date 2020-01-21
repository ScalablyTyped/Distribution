package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeValue extends js.Object {
  var deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]
  var serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]
}

object AnonDeserializeSerializeValue {
  @scala.inline
  def apply(
    deserialize: /* value */ SelectTypeKnobValue => SelectTypeKnobValue,
    serialize: /* value */ SelectTypeKnobValue => SelectTypeKnobValue
  ): AnonDeserializeSerializeValue = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonDeserializeSerializeValue]
  }
}

