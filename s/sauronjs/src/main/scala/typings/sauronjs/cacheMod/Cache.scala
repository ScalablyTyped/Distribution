package typings.sauronjs.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def clear(): Unit = js.native
  def exists(key: String): Boolean = js.native
  def forEach(fn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def keys(): js.Array[String] = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def size(): Double = js.native
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
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setExists(value: String => Boolean): Self = this.set("exists", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}

