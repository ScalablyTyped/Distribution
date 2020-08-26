package typings.socketclusterClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckTimeout extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.native
}

object AckTimeout {
  @scala.inline
  def apply(): AckTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AckTimeout]
  }
  @scala.inline
  implicit class AckTimeoutOps[Self <: AckTimeout] (val x: Self) extends AnyVal {
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
    def setAckTimeout(value: Double): Self = this.set("ackTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckTimeout: Self = this.set("ackTimeout", js.undefined)
  }
  
}

