package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerializeV extends js.Object {
  def deserialize(v: js.Any): js.Any
  def serialize(v: js.Any): js.Any
}

object Anon_DeserializeSerializeV {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Anon_DeserializeSerializeV = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerializeV]
  }
}

