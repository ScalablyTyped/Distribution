package typings.pubnub.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// APNS2
@js.native
trait APNS2Configuration extends js.Object {
  var collapseId: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[Date] = js.native
  var targets: js.Array[APNS2Target] = js.native
}

object APNS2Configuration {
  @scala.inline
  def apply(targets: js.Array[APNS2Target]): APNS2Configuration = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Configuration]
  }
  @scala.inline
  implicit class APNS2ConfigurationOps[Self <: APNS2Configuration] (val x: Self) extends AnyVal {
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
    def setTargetsVarargs(value: APNS2Target*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[APNS2Target]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapseId(value: String): Self = this.set("collapseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseId: Self = this.set("collapseId", js.undefined)
    @scala.inline
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
  }
  
}

