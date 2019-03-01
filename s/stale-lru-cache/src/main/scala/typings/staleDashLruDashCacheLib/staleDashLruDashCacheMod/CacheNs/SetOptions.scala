package typings
package staleDashLruDashCacheLib.staleDashLruDashCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[K, V] extends js.Object {
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[scala.Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[K, V](
    maxAge: scala.Int | scala.Double = null,
    revalidate: RevalidationCallback[K, V] = null,
    staleWhileRevalidate: scala.Int | scala.Double = null
  ): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(revalidate)
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions[K, V]]
  }
}

