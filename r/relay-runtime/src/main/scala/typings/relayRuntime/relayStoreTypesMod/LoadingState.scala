package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.aborted
import typings.relayRuntime.relayRuntimeStrings.complete
import typings.relayRuntime.relayRuntimeStrings.error_
import typings.relayRuntime.relayRuntimeStrings.missing
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingState extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var status: aborted | complete | error_ | missing = js.native
}

object LoadingState {
  @scala.inline
  def apply(status: aborted | complete | error_ | missing): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
  @scala.inline
  implicit class LoadingStateOps[Self <: LoadingState] (val x: Self) extends AnyVal {
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
    def setStatus(value: aborted | complete | error_ | missing): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

