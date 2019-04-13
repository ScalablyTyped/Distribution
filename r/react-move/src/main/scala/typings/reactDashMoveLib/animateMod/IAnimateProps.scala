package typings
package reactDashMoveLib.animateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateProps extends js.Object {
  var enter: js.UndefOr[js.Any] = js.undefined
  var interpolation: js.UndefOr[reactDashMoveLib.reactDashMoveMod.GetInterpolator] = js.undefined
  var leave: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.Any
  var update: js.UndefOr[js.Any] = js.undefined
  def children(state: reactDashMoveLib.reactDashMoveMod.HashMap): reactLib.reactMod.ReactElement[_]
}

object IAnimateProps {
  @scala.inline
  def apply(
    children: reactDashMoveLib.reactDashMoveMod.HashMap => reactLib.reactMod.ReactElement[_],
    start: js.Any,
    enter: js.Any = null,
    interpolation: reactDashMoveLib.reactDashMoveMod.GetInterpolator = null,
    leave: js.Any = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    update: js.Any = null
  ): IAnimateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[IAnimateProps]
  }
}

