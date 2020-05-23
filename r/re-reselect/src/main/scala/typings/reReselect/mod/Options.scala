package typings.reReselect.mod

import typings.reReselect.anon.InputSelectors
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
    keySelector: (S, /* repeated */ js.Any) => js.Any = null,
    keySelectorCreator: /* selectorInputs */ InputSelectors[D, C, S] => KeySelector[S] = null,
    selectorCreator: CreateSelectorInstance = null
  ): Options[S, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject.asInstanceOf[js.Any])
    if (keySelector != null) __obj.updateDynamic("keySelector")(js.Any.fromFunction2(keySelector))
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(js.Any.fromFunction1(keySelectorCreator))
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[S, C, D]]
  }
}

