package typings
package reactDashMoveLib.nodeGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeGroupProps extends js.Object {
  var data: js.Array[_]
  var enter: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ]
  ] = js.undefined
  var interpolation: js.UndefOr[reactDashMoveLib.reactDashMoveMod.GetInterpolator] = js.undefined
  var leave: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ]
  ] = js.undefined
  var update: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ]
  ] = js.undefined
  def children(nodes: js.Array[_]): reactLib.reactMod.ReactElement[_]
  def keyAccessor(data: js.Any, index: scala.Double): java.lang.String | scala.Double
  def start(data: js.Any, index: scala.Double): reactDashMoveLib.reactDashMoveMod.HashMap
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Array[_] => reactLib.reactMod.ReactElement[_],
    data: js.Array[_],
    keyAccessor: (js.Any, scala.Double) => java.lang.String | scala.Double,
    start: (js.Any, scala.Double) => reactDashMoveLib.reactDashMoveMod.HashMap,
    enter: (/* data */ js.Any, /* index */ scala.Double) => reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap] = null,
    interpolation: reactDashMoveLib.reactDashMoveMod.GetInterpolator = null,
    leave: (/* data */ js.Any, /* index */ scala.Double) => reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap] = null,
    update: (/* data */ js.Any, /* index */ scala.Double) => reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap] = null
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data, keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2(leave))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[INodeGroupProps]
  }
}

