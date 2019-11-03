package typings.sauronjs.srcCoreCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def clear(): Unit
  def exists(key: String): Boolean
  def forEach(fn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit
  def get(key: String): js.Any
  def keys(): js.Array[String]
  def set(key: String, value: js.Any): Unit
  def size(): Double
}

object Cache {
  @scala.inline
  def apply(
    clear: () => Unit,
    exists: String => Boolean,
    forEach: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit,
    get: String => js.Any,
    keys: () => js.Array[String],
    set: (String, js.Any) => Unit,
    size: () => Double
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), exists = js.Any.fromFunction1(exists), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[Cache]
  }
}

