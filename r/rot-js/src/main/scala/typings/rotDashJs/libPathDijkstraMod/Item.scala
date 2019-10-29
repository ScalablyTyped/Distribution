package typings.rotDashJs.libPathDijkstraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var prev: Item | Null
  var x: Double
  var y: Double
}

object Item {
  @scala.inline
  def apply(x: Double, y: Double, prev: Item = null): Item = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Item]
  }
}

