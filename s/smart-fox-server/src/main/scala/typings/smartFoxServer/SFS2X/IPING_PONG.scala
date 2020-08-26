package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPING_PONG extends js.Object {
  var lagValue: Double = js.native
}

object IPING_PONG {
  @scala.inline
  def apply(lagValue: Double): IPING_PONG = {
    val __obj = js.Dynamic.literal(lagValue = lagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPING_PONG]
  }
  @scala.inline
  implicit class IPING_PONGOps[Self <: IPING_PONG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLagValue(value: Double): Self = this.set("lagValue", value.asInstanceOf[js.Any])
  }
  
}

