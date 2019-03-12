package typings
package quickDashLruLib.quickDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickLRU[K, V]
  extends stdLib.Iterable[js.Tuple2[K, V]] {
  val size: scala.Double
  def clear(): scala.Unit
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def keys(): stdLib.Iterable[K]
  def peek(key: K): js.UndefOr[V]
  def set(key: K, value: V): this.type
  def values(): stdLib.Iterable[V]
}

object QuickLRU {
  @scala.inline
  def apply[K, V](
    clear: () => scala.Unit,
    delete: K => scala.Boolean,
    get: K => js.UndefOr[V],
    has: K => scala.Boolean,
    iterator: () => stdLib.Iterator[js.Tuple2[K, V]],
    keys: () => stdLib.Iterable[K],
    peek: K => js.UndefOr[V],
    set: (K, V) => QuickLRU[K, V],
    size: scala.Double,
    values: () => stdLib.Iterable[V]
  ): QuickLRU[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), iterator = js.Any.fromFunction0(iterator), keys = js.Any.fromFunction0(keys), peek = js.Any.fromFunction1(peek), set = js.Any.fromFunction2(set), size = size, values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[QuickLRU[K, V]]
  }
}

