package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded
import typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  var data: js.UndefOr[RateLimitExceeded | InternalServerError | TransactionFailed] = js.native
  var status: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Status {
  @scala.inline
  def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
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
    def setData(value: RateLimitExceeded | InternalServerError | TransactionFailed): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

