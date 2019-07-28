package typings.simpleDashLru.simpleDashLruMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleLRU[K, V] extends js.Object {
  def del(key: K): js.UndefOr[V] = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): Boolean = js.native
  def keys(): js.Array[K] = js.native
  def length(): Double = js.native
  def max(): Double = js.native
  def max(max: Double): Double = js.native
  def peek(key: K): js.UndefOr[V] = js.native
  def reset(): Unit = js.native
  def set(key: K, `val`: V): Unit = js.native
}

