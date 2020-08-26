package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.stale
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends OperationAvailability {
  var status: stale = js.native
}

object Status {
  @scala.inline
  def apply(status: stale): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
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
    def setStatus(value: stale): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

