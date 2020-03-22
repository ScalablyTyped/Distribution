package typings.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def reset(): Unit
  def set(key: String, value: js.Any): Unit
}

object AnonReset {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): AnonReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[AnonReset]
  }
}

