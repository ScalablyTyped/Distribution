package typings
package reactDashMoveLib.nodegroupMod

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
  def children(nodes: js.Array[_]): reactLib.reactMod.ReactNs.ReactElement[_]
  def keyAccessor(data: js.Any, index: scala.Double): java.lang.String | scala.Double
  def start(data: js.Any, index: scala.Double): reactDashMoveLib.reactDashMoveMod.HashMap
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Function1[js.Array[_], reactLib.reactMod.ReactNs.ReactElement[_]],
    data: js.Array[_],
    keyAccessor: js.Function2[js.Any, scala.Double, java.lang.String | scala.Double],
    start: js.Function2[js.Any, scala.Double, reactDashMoveLib.reactDashMoveMod.HashMap],
    enter: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ] = null,
    interpolation: reactDashMoveLib.reactDashMoveMod.GetInterpolator = null,
    leave: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ] = null,
    update: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      reactDashMoveLib.reactDashMoveMod.HashMap | js.Array[reactDashMoveLib.reactDashMoveMod.HashMap]
    ] = null
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(children = children, data = data, keyAccessor = keyAccessor, start = start)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[INodeGroupProps]
  }
}

