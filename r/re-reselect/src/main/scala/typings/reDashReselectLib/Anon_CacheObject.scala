package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheObject
  extends reDashReselectLib.reDashReselectMod.Options {
  var cacheObject: reDashReselectLib.reDashReselectMod.ICacheObject
  var selectorCreator: js.UndefOr[reDashReselectLib.reDashReselectMod.CreateSelectorInstance] = js.undefined
}

object Anon_CacheObject {
  @scala.inline
  def apply(
    cacheObject: reDashReselectLib.reDashReselectMod.ICacheObject,
    selectorCreator: reDashReselectLib.reDashReselectMod.CreateSelectorInstance = null
  ): Anon_CacheObject = {
    val __obj = js.Dynamic.literal(cacheObject = cacheObject)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[Anon_CacheObject]
  }
}

