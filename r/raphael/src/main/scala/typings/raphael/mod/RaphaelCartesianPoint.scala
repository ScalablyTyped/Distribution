package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelCartesianPoint extends js.Object {
  /** The x coordinate of the point. */
  var x: Double
  /** The y coordinate of the point. */
  var y: Double
}

object RaphaelCartesianPoint {
  @scala.inline
  def apply(x: Double, y: Double): RaphaelCartesianPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaphaelCartesianPoint]
  }
}

