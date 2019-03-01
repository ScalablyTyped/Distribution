package typings
package staleDashLruDashCacheLib.staleDashLruDashCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions[K, V] extends js.Object {
  var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, scala.Double]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[scala.Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply[K, V](
    getSize: js.Function2[/* value */ V, /* key */ K, scala.Double] = null,
    maxAge: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    revalidate: RevalidationCallback[K, V] = null,
    staleWhileRevalidate: scala.Int | scala.Double = null
  ): CacheOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (getSize != null) __obj.updateDynamic("getSize")(getSize)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(revalidate)
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions[K, V]]
  }
}

