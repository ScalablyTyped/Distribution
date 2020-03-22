package typings.scrollbooster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<scrollbooster.scrollbooster.Position> */
trait RequiredPosition extends js.Object {
  var x: Double
  var y: Double
}

object RequiredPosition {
  @scala.inline
  def apply(x: Double, y: Double): RequiredPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredPosition]
  }
}

