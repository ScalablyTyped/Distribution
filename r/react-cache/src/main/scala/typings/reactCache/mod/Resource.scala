package typings.reactCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): Unit
  def read(key: Input): Value
}

object Resource {
  @scala.inline
  def apply[Input, Value](preload: Input => Unit, read: Input => Value): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Resource[Input, Value]]
  }
}

