package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCache extends js.Object {
  def delete(id: String): Boolean
  def get[T](id: String): T
  def has(id: String): Boolean
  def set[T](id: String, value: T): Unit
}

object PluginCache {
  @scala.inline
  def apply(
    delete: String => Boolean,
    get: String => js.Any,
    has: String => Boolean,
    set: (String, js.Any) => Unit
  ): PluginCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[PluginCache]
  }
}

