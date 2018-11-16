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

