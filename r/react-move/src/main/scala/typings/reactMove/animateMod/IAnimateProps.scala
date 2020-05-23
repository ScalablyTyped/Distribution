package typings.reactMove.animateMod

import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
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
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4(interpolation))
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimateProps]
  }
}

