package typings.rotJs.astarMod

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
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

