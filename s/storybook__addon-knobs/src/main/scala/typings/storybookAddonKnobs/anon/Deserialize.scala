package typings.storybookAddonKnobs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deserialize extends js.Object {
  def deserialize(v: js.Any): js.Any
  def serialize(v: js.Any): js.Any
}

object Deserialize {
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Deserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Deserialize]
  }
}

