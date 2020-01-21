package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentMax extends js.Object {
  var current: Double
  var max: Double
}

object AnonCurrentMax {
  @scala.inline
  def apply(current: Double, max: Double): AnonCurrentMax = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentMax]
  }
}

