package typings.reactSelect.filtersMod

import typings.reactSelect.reactSelectStrings.any
import typings.reactSelect.reactSelectStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ignoreAccents: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var matchFrom: js.UndefOr[any | start] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ignoreAccents: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    matchFrom: any | start = null,
    stringify: /* obj */ js.Any => String = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAccents)) __obj.updateDynamic("ignoreAccents")(ignoreAccents.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (matchFrom != null) __obj.updateDynamic("matchFrom")(matchFrom.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

