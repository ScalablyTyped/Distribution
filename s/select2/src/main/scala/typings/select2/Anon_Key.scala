package typings.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  def reset(): Unit
  def set(key: String, value: js.Any): Unit
}

object Anon_Key {
  @scala.inline
  def apply(reset: () => Unit, set: (String, js.Any) => Unit): Anon_Key = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_Key]
  }
}

