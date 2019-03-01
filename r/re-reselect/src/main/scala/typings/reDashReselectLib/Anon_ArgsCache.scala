package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsCache[C, R, P, S, D] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject
  def clearCache(): scala.Unit
  def getMatchingSelector(state: S, props: P, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C, D]
  def removeMatchingSelector(state: S, props: P, args: js.Any*): scala.Unit
}

object Anon_ArgsCache {
  @scala.inline
  def apply[C, R, P, S, D](
    cache: reDashReselectLib.reDashReselectMod.ICacheObject,
    clearCache: js.Function0[scala.Unit],
    getMatchingSelector: js.Function3[
      S, 
      P, 
      /* repeated */ js.Any, 
      reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C, D]
    ],
    removeMatchingSelector: js.Function3[S, P, /* repeated */ js.Any, scala.Unit]
  ): Anon_ArgsCache[C, R, P, S, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("clearCache")(clearCache)
    __obj.updateDynamic("getMatchingSelector")(getMatchingSelector)
    __obj.updateDynamic("removeMatchingSelector")(removeMatchingSelector)
    __obj.asInstanceOf[Anon_ArgsCache[C, R, P, S, D]]
  }
}

