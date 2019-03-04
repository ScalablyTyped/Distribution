package typings
package streamjsLib.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  var done: scala.Boolean
  def next(): T
}

object Iterator {
  @scala.inline
  def apply[T](done: scala.Boolean, next: js.Function0[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(done = done, next = next)
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

