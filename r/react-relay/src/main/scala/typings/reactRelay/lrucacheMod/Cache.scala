package typings.reactRelay.lrucacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[T] extends js.Object {
  def capacity(): Double
  def clear(): Unit
  def delete(key: String): Unit
  def get(key: String): T | Null
  def has(key: String): Boolean
  def set(key: String, value: T): Unit
  def size(): Double
}

object Cache {
  @scala.inline
  def apply[T](
    capacity: () => Double,
    clear: () => Unit,
    delete: String => Unit,
    get: String => T | Null,
    has: String => Boolean,
    set: (String, T) => Unit,
    size: () => Double
  ): Cache[T] = {
    val __obj = js.Dynamic.literal(capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[Cache[T]]
  }
}

