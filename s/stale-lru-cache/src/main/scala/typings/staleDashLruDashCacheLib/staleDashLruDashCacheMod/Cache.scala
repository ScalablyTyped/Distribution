package typings
package staleDashLruDashCacheLib.staleDashLruDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[K, V] extends js.Object {
  def delete(key: K): scala.Boolean = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def isStale(key: K): scala.Boolean = js.native
  def keys(): js.Array[K] = js.native
  def reset(): scala.Unit = js.native
  def set(key: K, value: V): scala.Boolean = js.native
  def set(key: K, value: V, options: java.lang.String): scala.Boolean = js.native
  def set(
    key: K,
    value: V,
    options: staleDashLruDashCacheLib.staleDashLruDashCacheMod.CacheNs.SetOptions[K, V]
  ): scala.Boolean = js.native
  def size(): scala.Double = js.native
  def values(): js.Array[V] = js.native
  def wrap(
    key: K,
    revalidate: staleDashLruDashCacheLib.staleDashLruDashCacheMod.CacheNs.RevalidationCallback[K, V],
    callback: staleDashLruDashCacheLib.staleDashLruDashCacheMod.CacheNs.OptionsCallback[K, V]
  ): scala.Unit = js.native
}

