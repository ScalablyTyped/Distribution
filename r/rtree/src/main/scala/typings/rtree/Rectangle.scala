package typings.rtree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  var h: Double
  var w: Double
  var x: Double
  var y: Double
}

object Rectangle {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(h = h, w = w, x = x, y = y)
  
    __obj.asInstanceOf[Rectangle]
  }
}

