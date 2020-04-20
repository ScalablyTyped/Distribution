package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: js.Array[Double]
  var offsetRelative: js.Array[Double]
}

object AnonOffset {
  @scala.inline
  def apply(offset: js.Array[Double], offsetRelative: js.Array[Double]): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetRelative = offsetRelative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

