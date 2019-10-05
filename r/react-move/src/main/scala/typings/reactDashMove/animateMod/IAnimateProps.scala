package typings.reactDashMove.animateMod

import typings.react.reactMod.ReactElement
import typings.reactDashMove.reactDashMoveMod.GetInterpolator
import typings.reactDashMove.reactDashMoveMod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateProps extends js.Object {
  var enter: js.UndefOr[js.Any] = js.undefined
  var interpolation: js.UndefOr[GetInterpolator] = js.undefined
  var leave: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var start: js.Any
  var update: js.UndefOr[js.Any] = js.undefined
  def children(state: HashMap): ReactElement
}

object IAnimateProps {
  @scala.inline
  def apply(
    children: HashMap => ReactElement,
    start: js.Any,
    enter: js.Any = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any] = null,
    leave: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    update: js.Any = null
  ): IAnimateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4(interpolation))
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[IAnimateProps]
  }
}

