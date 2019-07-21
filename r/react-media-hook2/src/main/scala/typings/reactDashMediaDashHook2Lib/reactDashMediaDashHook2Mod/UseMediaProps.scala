package typings
package reactDashMediaDashHook2Lib.reactDashMediaDashHook2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMediaProps extends js.Object {
  var defaultMatches: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit | scala.Boolean]] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var query: js.UndefOr[
    java.lang.String | reactDashMediaDashHook2Lib.libMediaMod.MediaQueryProperties | js.Array[reactDashMediaDashHook2Lib.libMediaMod.MediaQueryProperties]
  ] = js.undefined
  var targetWindow: js.UndefOr[stdLib.Window] = js.undefined
}

object UseMediaProps {
  @scala.inline
  def apply(
    defaultMatches: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.Any = null,
    onChange: /* matches */ scala.Boolean => scala.Unit | scala.Boolean = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String | reactDashMediaDashHook2Lib.libMediaMod.MediaQueryProperties | js.Array[reactDashMediaDashHook2Lib.libMediaMod.MediaQueryProperties] = null,
    targetWindow: stdLib.Window = null
  ): UseMediaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow)
    __obj.asInstanceOf[UseMediaProps]
  }
}

