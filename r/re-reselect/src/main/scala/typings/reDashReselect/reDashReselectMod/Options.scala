package typings.reDashReselect.reDashReselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[S, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.undefined
  var keySelector: js.UndefOr[KeySelector[S]] = js.undefined
  var keySelectorCreator: js.UndefOr[KeySelectorCreator[S, C, D]] = js.undefined
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.undefined
}

object Options {
  @scala.inline
  def apply[S, C, D](
    cacheObject: ICacheObject = null,
    keySelector: KeySelector[S] = null,
    keySelectorCreator: KeySelectorCreator[S, C, D] = null,
    selectorCreator: CreateSelectorInstance = null
  ): Options[S, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject)
    if (keySelector != null) __obj.updateDynamic("keySelector")(keySelector)
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(keySelectorCreator)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[Options[S, C, D]]
  }
}

