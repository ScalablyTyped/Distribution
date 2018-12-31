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

