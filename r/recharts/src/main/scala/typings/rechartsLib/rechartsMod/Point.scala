package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var value: scala.Double | js.Array[_]
  var x: scala.Double
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(value: scala.Double | js.Array[_], x: scala.Double, y: scala.Double): Point = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

