package typings.reactDashMedia.reactDashMediaMod

import typings.react.reactMod.ReactNode
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.undefined
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: String | MediaQueryObject | js.Array[MediaQueryObject]
  var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[Window] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    query: String | MediaQueryObject | js.Array[MediaQueryObject],
    children: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode = null,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Unit = null,
    render: () => ReactNode = null,
    targetWindow: Window = null
  ): MediaProps = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow)
    __obj.asInstanceOf[MediaProps]
  }
}

