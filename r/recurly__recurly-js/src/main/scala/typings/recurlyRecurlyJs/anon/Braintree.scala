package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Braintree extends js.Object {
  var braintree: js.UndefOr[DeviceData] = js.native
  var kount: js.UndefOr[DataCollector] = js.native
  var litle: js.UndefOr[SessionId] = js.native
}

object Braintree {
  @scala.inline
  def apply(): Braintree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Braintree]
  }
  @scala.inline
  implicit class BraintreeOps[Self <: Braintree] (val x: Self) extends AnyVal {
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
    def setBraintree(value: DeviceData): Self = this.set("braintree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraintree: Self = this.set("braintree", js.undefined)
    @scala.inline
    def setKount(value: DataCollector): Self = this.set("kount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKount: Self = this.set("kount", js.undefined)
    @scala.inline
    def setLitle(value: SessionId): Self = this.set("litle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLitle: Self = this.set("litle", js.undefined)
  }
  
}

