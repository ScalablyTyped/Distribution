package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args[S, R, C, D] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  def clearCache(): scala.Unit
  def getMatchingSelector(state: S, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputSelector[S, R, C, D]
  def removeMatchingSelector(state: S, args: js.Any*): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply[S, R, C, D](
    cache: reDashReselectLib.reDashReselectMod.ICacheObject,
    clearCache: () => scala.Unit,
    getMatchingSelector: (S, /* repeated */ js.Any) => reDashReselectLib.reDashReselectMod.OutputSelector[S, R, C, D],
    removeMatchingSelector: (S, /* repeated */ js.Any) => scala.Unit
  ): Anon_Args[S, R, C, D] = {
    val __obj = js.Dynamic.literal(cache = cache, clearCache = js.Any.fromFunction0(clearCache), getMatchingSelector = js.Any.fromFunction2(getMatchingSelector), removeMatchingSelector = js.Any.fromFunction2(removeMatchingSelector))
  
    __obj.asInstanceOf[Anon_Args[S, R, C, D]]
  }
}

