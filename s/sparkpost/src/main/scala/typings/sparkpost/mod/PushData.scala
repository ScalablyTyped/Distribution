package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushData extends js.Object {
  /** payload for APNs messages */
  var apns: js.UndefOr[js.Any] = js.native
  /** payload for GCM messages */
  var gcm: js.UndefOr[js.Any] = js.native
}

object PushData {
  @scala.inline
  def apply(): PushData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushData]
  }
  @scala.inline
  implicit class PushDataOps[Self <: PushData] (val x: Self) extends AnyVal {
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
    def setApns(value: js.Any): Self = this.set("apns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApns: Self = this.set("apns", js.undefined)
    @scala.inline
    def setGcm(value: js.Any): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcm: Self = this.set("gcm", js.undefined)
  }
  
}

