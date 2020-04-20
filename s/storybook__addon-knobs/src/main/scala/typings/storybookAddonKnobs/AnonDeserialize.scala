package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserialize extends js.Object {
  def deserialize(v: js.Any): js.Any
  def serialize(v: js.Any): js.Any
}

object AnonDeserialize {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): AnonDeserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[AnonDeserialize]
  }
}

