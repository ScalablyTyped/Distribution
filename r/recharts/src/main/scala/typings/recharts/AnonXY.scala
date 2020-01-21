package typings.recharts

import typings.recharts.mod.AllowEscapeViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXY extends AllowEscapeViewBox {
  var x: Boolean
  var y: Boolean
}

object AnonXY {
  @scala.inline
  def apply(x: Boolean, y: Boolean): AnonXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXY]
  }
}

