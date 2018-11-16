package typings
package simpleDashLruLib.simpleDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleLRU[K, V] extends js.Object {
  def del(key: K): js.UndefOr[V] = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def keys(): js.Array[K] = js.native
  def length(): scala.Double = js.native
  def max(): scala.Double = js.native
  def max(max: scala.Double): scala.Double = js.native
  def peek(key: K): js.UndefOr[V] = js.native
  def reset(): scala.Unit = js.native
  def set(key: K, `val`: V): scala.Unit = js.native
}

