package typings.reDashReselect.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametricOptions[S, P, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.undefined
  var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.undefined
  var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.undefined
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.undefined
}

object ParametricOptions {
  @scala.inline
  def apply[S, P, C, D](
    cacheObject: ICacheObject = null,
    keySelector: ParametricKeySelector[S, P] = null,
    keySelectorCreator: ParametricKeySelectorCreator[S, P, C, D] = null,
    selectorCreator: CreateSelectorInstance = null
  ): ParametricOptions[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject)
    if (keySelector != null) __obj.updateDynamic("keySelector")(keySelector)
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(keySelectorCreator)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
  }
}

