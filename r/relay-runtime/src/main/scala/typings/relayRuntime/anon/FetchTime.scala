package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.available
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchTime extends OperationAvailability {
  var fetchTime: js.UndefOr[Double | Null] = js.native
  var status: available = js.native
}

object FetchTime {
  @scala.inline
  def apply(status: available): FetchTime = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchTime]
  }
  @scala.inline
  implicit class FetchTimeOps[Self <: FetchTime] (val x: Self) extends AnyVal {
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
    def setStatus(value: available): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchTime(value: Double): Self = this.set("fetchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchTime: Self = this.set("fetchTime", js.undefined)
    @scala.inline
    def setFetchTimeNull: Self = this.set("fetchTime", null)
  }
  
}

