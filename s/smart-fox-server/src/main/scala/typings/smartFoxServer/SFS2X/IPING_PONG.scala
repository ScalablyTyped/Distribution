package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPING_PONG extends js.Object {
  var lagValue: Double
}

object IPING_PONG {
  @scala.inline
  def apply(lagValue: Double): IPING_PONG = {
    val __obj = js.Dynamic.literal(lagValue = lagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPING_PONG]
  }
}

