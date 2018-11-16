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

