package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathStep extends js.Object {
  var direction: DirectionConstant
  var dx: Double
  var dy: Double
  var x: Double
  var y: Double
}

object PathStep {
  @scala.inline
  def apply(direction: DirectionConstant, dx: Double, dy: Double, x: Double, y: Double): PathStep = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dx = dx, dy = dy, x = x, y = y)
  
    __obj.asInstanceOf[PathStep]
  }
}

