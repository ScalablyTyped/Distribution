package typings.reactDashMove.nodeGroupMod

import typings.react.reactMod.ReactElement
import typings.reactDashMove.reactDashMoveMod.GetInterpolator
import typings.reactDashMove.reactDashMoveMod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeGroupProps extends js.Object {
  var data: js.Array[_]
  var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  var interpolation: js.UndefOr[GetInterpolator] = js.undefined
  var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  def children(nodes: js.Array[_]): ReactElement
  def keyAccessor(data: js.Any, index: Double): String | Double
  def start(data: js.Any, index: Double): HashMap
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Array[_] => ReactElement,
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap,
    enter: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any] = null,
    leave: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null,
    update: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap] = null
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4(interpolation))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[INodeGroupProps]
  }
}

