package typings.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions[K, V] extends js.Object {
  var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, Double]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply[K, V](
    getSize: (/* value */ V, /* key */ K) => Double = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    revalidate: (K, /* callback */ OptionsCallback[K, V]) => Unit = null,
    staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  ): CacheOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction2(getSize))
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(js.Any.fromFunction2(revalidate))
    if (!js.isUndefined(staleWhileRevalidate)) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions[K, V]]
  }
}

