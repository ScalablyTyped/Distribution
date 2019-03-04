package typings
package reDashReselectLib.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheObject extends js.Object {
  var isValidCacheKey: js.UndefOr[js.Function1[/* key */ js.Any, scala.Boolean]] = js.undefined
  def clear(): scala.Unit
  def get(key: js.Any): js.Any
  def remove(key: js.Any): scala.Unit
  def set(key: js.Any, selectorFn: js.Any): scala.Unit
}

object ICacheObject {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    get: js.Function1[js.Any, js.Any],
    remove: js.Function1[js.Any, scala.Unit],
    set: js.Function2[js.Any, js.Any, scala.Unit],
    isValidCacheKey: js.Function1[/* key */ js.Any, scala.Boolean] = null
  ): ICacheObject = {
    val __obj = js.Dynamic.literal(clear = clear, get = get, remove = remove, set = set)
    if (isValidCacheKey != null) __obj.updateDynamic("isValidCacheKey")(isValidCacheKey)
    __obj.asInstanceOf[ICacheObject]
  }
}

