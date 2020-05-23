package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item[T] extends js.Object {
  def Item(index: js.Any): T
}

object Item {
  @scala.inline
  def apply[T](Item: js.Any => T): Item[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Item[T]]
  }
}

