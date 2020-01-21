package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeValueT extends js.Object {
  def deserialize[T_1](value: T_1): T_1
  def serialize[T](value: T): T
}

object AnonDeserializeSerializeValueT {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): AnonDeserializeSerializeValueT = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonDeserializeSerializeValueT]
  }
}

