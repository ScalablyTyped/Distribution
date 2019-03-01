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
    clear: js.Function0[scala.Unit],
    delete: js.Function1[K, scala.Boolean],
    get: js.Function1[K, js.UndefOr[V]],
    has: js.Function1[K, scala.Boolean],
    iterator: js.Function0[stdLib.Iterator[js.Tuple2[K, V]]],
    keys: js.Function0[stdLib.Iterable[K]],
    peek: js.Function1[K, js.UndefOr[V]],
    set: js.Function2[K, V, QuickLRU[K, V]],
    size: scala.Double,
    values: js.Function0[stdLib.Iterable[V]]
  ): QuickLRU[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("iterator")(iterator)
    __obj.updateDynamic("keys")(keys)
    __obj.updateDynamic("peek")(peek)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QuickLRU[K, V]]
  }
}

