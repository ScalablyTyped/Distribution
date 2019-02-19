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

