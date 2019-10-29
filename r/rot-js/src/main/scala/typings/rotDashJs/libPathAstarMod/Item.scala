package typings.rotDashJs.libPathAstarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var g: Double
  var h: Double
  var prev: Item | Null
  var x: Double
  var y: Double
}

object Item {
  @scala.inline
  def apply(g: Double, h: Double, x: Double, y: Double, prev: Item = null): Item = {
    val __obj = js.Dynamic.literal(g = g, h = h, x = x, y = y)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Item]
  }
}

