package typings.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  var done: Boolean
  def next(): T
}

object Iterator {
  @scala.inline
  def apply[T](done: Boolean, next: () => T): Iterator[T] = {
    val __obj = js.Dynamic.literal(done = done, next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

