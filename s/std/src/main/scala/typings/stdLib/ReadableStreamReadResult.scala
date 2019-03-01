package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReadResult[T] extends js.Object {
  var done: scala.Boolean
  var value: T
}

object ReadableStreamReadResult {
  @scala.inline
  def apply[T](done: scala.Boolean, value: T): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
}

