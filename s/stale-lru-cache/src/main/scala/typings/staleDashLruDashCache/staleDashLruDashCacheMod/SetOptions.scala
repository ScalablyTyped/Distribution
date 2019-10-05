package typings.staleDashLruDashCache.staleDashLruDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[K, V] extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[K, V](
    maxAge: Int | Double = null,
    revalidate: (K, /* callback */ OptionsCallback[K, V]) => Unit = null,
    staleWhileRevalidate: Int | Double = null
  ): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(js.Any.fromFunction2(revalidate))
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions[K, V]]
  }
}

