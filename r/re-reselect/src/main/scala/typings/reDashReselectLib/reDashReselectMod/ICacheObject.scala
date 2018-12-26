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

