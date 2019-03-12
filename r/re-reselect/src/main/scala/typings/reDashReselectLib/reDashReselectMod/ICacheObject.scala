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
    clear: () => scala.Unit,
    get: js.Any => js.Any,
    remove: js.Any => scala.Unit,
    set: (js.Any, js.Any) => scala.Unit,
    isValidCacheKey: /* key */ js.Any => scala.Boolean = null
  ): ICacheObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    if (isValidCacheKey != null) __obj.updateDynamic("isValidCacheKey")(js.Any.fromFunction1(isValidCacheKey))
    __obj.asInstanceOf[ICacheObject]
  }
}

