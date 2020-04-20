package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccepted extends js.Object {
  var accepted: Boolean
  var x: js.Array[Double]
}

object AnonAccepted {
  @scala.inline
  def apply(accepted: Boolean, x: js.Array[Double]): AnonAccepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccepted]
  }
}

