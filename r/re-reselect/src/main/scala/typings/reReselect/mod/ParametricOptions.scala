package typings.reReselect.mod

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
    keySelector: (S, P, /* repeated */ js.Any) => js.Any = null,
    keySelectorCreator: /* selectorInputs */ typings.reReselect.anon.KeySelector[D, C, S, P] => ParametricKeySelector[S, P] = null,
    selectorCreator: CreateSelectorInstance = null
  ): ParametricOptions[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject.asInstanceOf[js.Any])
    if (keySelector != null) __obj.updateDynamic("keySelector")(js.Any.fromFunction3(keySelector))
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(js.Any.fromFunction1(keySelectorCreator))
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
  }
}

