package typings
package reactDashSelectLib.libFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var ignoreAccents: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var matchFrom: js.UndefOr[
    reactDashSelectLib.reactDashSelectLibStrings.any | reactDashSelectLib.reactDashSelectLibStrings.start
  ] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, java.lang.String]] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    ignoreAccents: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    matchFrom: reactDashSelectLib.reactDashSelectLibStrings.any | reactDashSelectLib.reactDashSelectLibStrings.start = null,
    stringify: js.Function1[/* obj */ js.Any, java.lang.String] = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreAccents)) __obj.updateDynamic("ignoreAccents")(ignoreAccents)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (matchFrom != null) __obj.updateDynamic("matchFrom")(matchFrom.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[Config]
  }
}

