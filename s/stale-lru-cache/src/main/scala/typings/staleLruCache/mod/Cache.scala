package typings.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[K, V] extends js.Object {
  def delete(key: K): Boolean = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): Boolean = js.native
  def isStale(key: K): Boolean = js.native
  def keys(): js.Array[K] = js.native
  def reset(): Unit = js.native
  def set(key: K, value: V): Boolean = js.native
  def set(key: K, value: V, options: String): Boolean = js.native
  def set(key: K, value: V, options: SetOptions[K, V]): Boolean = js.native
  def size(): Double = js.native
  def values(): js.Array[V] = js.native
  def wrap(key: K, revalidate: RevalidationCallback[K, V], callback: OptionsCallback[K, V]): Unit = js.native
}

