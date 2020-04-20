package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInertia extends js.Object {
  var inertia: Boolean
}

object AnonInertia {
  @scala.inline
  def apply(inertia: Boolean): AnonInertia = {
    val __obj = js.Dynamic.literal(inertia = inertia.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInertia]
  }
}

