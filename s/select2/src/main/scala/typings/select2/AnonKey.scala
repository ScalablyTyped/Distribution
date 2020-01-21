package typings.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  def reset(): Unit
  def set(key: String, value: js.Any): Unit
}

object AnonKey {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): AnonKey = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[AnonKey]
  }
}

