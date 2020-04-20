package typings.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: String
  var top: Double
}

object AnonLeft {
  @scala.inline
  def apply(left: String, top: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

