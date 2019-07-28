package typings.reactDashMediaDashHook2.esMod

import typings.reactDashMediaDashHook2.esMediaMod.MediaQueryProperties
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMediaProps extends js.Object {
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit | Boolean]] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[String | MediaQueryProperties | js.Array[MediaQueryProperties]] = js.undefined
  var targetWindow: js.UndefOr[Window] = js.undefined
}

object UseMediaProps {
  @scala.inline
  def apply(
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    id: js.Any = null,
    onChange: /* matches */ Boolean => Unit | Boolean = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    query: String | MediaQueryProperties | js.Array[MediaQueryProperties] = null,
    targetWindow: Window = null
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

