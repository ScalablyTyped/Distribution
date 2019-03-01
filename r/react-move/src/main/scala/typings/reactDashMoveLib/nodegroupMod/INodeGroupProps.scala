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
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ]
  ] = js.undefined
  var interpolation: js.UndefOr[reactDashMoveLib.reactDashMoveMod.GetInterpolator] = js.undefined
  var leave: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ]
  ] = js.undefined
  var update: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ]
  ] = js.undefined
  def children(nodes: js.Array[_]): reactLib.reactMod.ReactNs.ReactElement[_]
  def keyAccessor(data: js.Any, index: scala.Double): java.lang.String | scala.Double
  def start(data: js.Any, index: scala.Double): kapellmeisterLib.kapellmeisterMod.HashMap
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Function1[js.Array[_], reactLib.reactMod.ReactNs.ReactElement[_]],
    data: js.Array[_],
    keyAccessor: js.Function2[js.Any, scala.Double, java.lang.String | scala.Double],
    start: js.Function2[js.Any, scala.Double, kapellmeisterLib.kapellmeisterMod.HashMap],
    enter: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ] = null,
    interpolation: reactDashMoveLib.reactDashMoveMod.GetInterpolator = null,
    leave: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ] = null,
    update: js.Function2[
      /* data */ js.Any, 
      /* index */ scala.Double, 
      kapellmeisterLib.kapellmeisterMod.HashMap | js.Array[kapellmeisterLib.kapellmeisterMod.HashMap]
    ] = null
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("keyAccessor")(keyAccessor)
    __obj.updateDynamic("start")(start)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[INodeGroupProps]
  }
}

