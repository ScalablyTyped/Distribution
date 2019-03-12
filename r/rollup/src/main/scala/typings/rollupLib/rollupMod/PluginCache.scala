package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCache extends js.Object {
  def delete(id: java.lang.String): scala.Boolean
  def get[T](id: java.lang.String): T
  def has(id: java.lang.String): scala.Boolean
  def set[T](id: java.lang.String, value: T): scala.Unit
}

object PluginCache {
  @scala.inline
  def apply(
    delete: java.lang.String => scala.Boolean,
    get: java.lang.String => js.Any,
    has: java.lang.String => scala.Boolean,
    set: (java.lang.String, js.Any) => scala.Unit
  ): PluginCache = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[PluginCache]
  }
}

