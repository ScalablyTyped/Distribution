package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosed extends js.Object {
  var closed: Boolean
  var value: Double
}

object AnonClosed {
  @scala.inline
  def apply(closed: Boolean, value: Double): AnonClosed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosed]
  }
}

