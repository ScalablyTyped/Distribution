package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeserializeSerializeValueT extends js.Object {
  def deserialize[T](value: T): T
  def serialize[T](value: T): T
}

object Anon_DeserializeSerializeValueT {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Anon_DeserializeSerializeValueT = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Anon_DeserializeSerializeValueT]
  }
}

