package typings.reactBroadcast.mod.Broadcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[T] extends js.Object {
  def compareValues(prevValue: T, nextValue: T): Boolean
}

object DefaultProps {
  @scala.inline
  def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
    val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
    __obj.asInstanceOf[DefaultProps[T]]
  }
}

