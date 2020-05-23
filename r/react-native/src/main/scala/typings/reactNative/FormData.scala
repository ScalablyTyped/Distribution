package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormData extends js.Object {
  def append(name: String, value: js.Any): Unit
}

object FormData {
  @scala.inline
  def apply(append: (String, js.Any) => Unit): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append))
    __obj.asInstanceOf[FormData]
  }
}

