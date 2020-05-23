package typings.staleLruCache.mod

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
    maxAge: js.UndefOr[Double] = js.undefined,
    revalidate: (K, /* callback */ OptionsCallback[K, V]) => Unit = null,
    staleWhileRevalidate: js.UndefOr[Double] = js.undefined
  ): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(js.Any.fromFunction2(revalidate))
    if (!js.isUndefined(staleWhileRevalidate)) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions[K, V]]
  }
}

