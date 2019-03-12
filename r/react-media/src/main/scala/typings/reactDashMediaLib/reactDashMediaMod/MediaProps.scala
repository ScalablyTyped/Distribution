package typings
package reactDashMediaLib.reactDashMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var defaultMatches: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ scala.Boolean, scala.Unit]] = js.undefined
  var query: java.lang.String | MediaQueryObject | js.Array[MediaQueryObject]
  var render: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[stdLib.Window] = js.undefined
}

object MediaProps {
  @scala.inline
  def apply(
    query: java.lang.String | MediaQueryObject | js.Array[MediaQueryObject],
    children: (js.Function1[/* matches */ scala.Boolean, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode = null,
    defaultMatches: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* matches */ scala.Boolean => scala.Unit = null,
    render: () => reactLib.reactMod.ReactNs.ReactNode = null,
    targetWindow: stdLib.Window = null
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

