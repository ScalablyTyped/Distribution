package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheObjectKeySelectorCreator[S, P, C, D]
  extends reDashReselectLib.reDashReselectMod.ParametricOptions[S, P, C, D] {
  var cacheObject: js.UndefOr[reDashReselectLib.reDashReselectMod.ICacheObject] = js.undefined
  var keySelectorCreator: js.UndefOr[reDashReselectLib.reDashReselectMod.ParametricKeySelectorCreator[S, P, C, D]] = js.undefined
  var selectorCreator: js.UndefOr[reDashReselectLib.reDashReselectMod.CreateSelectorInstance] = js.undefined
}

object Anon_CacheObjectKeySelectorCreator {
  @scala.inline
  def apply[S, P, C, D](
    cacheObject: reDashReselectLib.reDashReselectMod.ICacheObject = null,
    keySelectorCreator: reDashReselectLib.reDashReselectMod.ParametricKeySelectorCreator[S, P, C, D] = null,
    selectorCreator: reDashReselectLib.reDashReselectMod.CreateSelectorInstance = null
  ): Anon_CacheObjectKeySelectorCreator[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject)
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(keySelectorCreator)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[Anon_CacheObjectKeySelectorCreator[S, P, C, D]]
  }
}

