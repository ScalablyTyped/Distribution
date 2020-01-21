package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeV extends js.Object {
  def deserialize(v: js.Any): js.Any
  def serialize(v: js.Any): js.Any
}

object AnonDeserializeSerializeV {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): AnonDeserializeSerializeV = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonDeserializeSerializeV]
  }
}

