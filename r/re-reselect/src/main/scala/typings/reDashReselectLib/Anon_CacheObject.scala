package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheObject[S, C, D]
  extends reDashReselectLib.reDashReselectMod.Options[S, C, D] {
  var cacheObject: js.UndefOr[reDashReselectLib.reDashReselectMod.ICacheObject] = js.undefined
  var keySelectorCreator: js.UndefOr[reDashReselectLib.reDashReselectMod.KeySelectorCreator[S, C, D]] = js.undefined
  var selectorCreator: js.UndefOr[reDashReselectLib.reDashReselectMod.CreateSelectorInstance] = js.undefined
}

object Anon_CacheObject {
  @scala.inline
  def apply[S, C, D](
    cacheObject: reDashReselectLib.reDashReselectMod.ICacheObject = null,
    keySelectorCreator: reDashReselectLib.reDashReselectMod.KeySelectorCreator[S, C, D] = null,
    selectorCreator: reDashReselectLib.reDashReselectMod.CreateSelectorInstance = null
  ): Anon_CacheObject[S, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject)
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(keySelectorCreator)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[Anon_CacheObject[S, C, D]]
  }
}

