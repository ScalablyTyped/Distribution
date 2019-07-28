package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var x: Double
  var y: Double
}

object Coordinate {
  @scala.inline
  def apply(x: Double, y: Double): Coordinate = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Coordinate]
  }
}

