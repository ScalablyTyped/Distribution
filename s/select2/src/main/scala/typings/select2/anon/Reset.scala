package typings.select2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reset extends js.Object {
  def reset(): Unit
  def set(key: String, value: js.Any): Unit
}

object Reset {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Reset]
  }
}

