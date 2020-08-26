package typings.relayTestUtils.anon

import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerProvider extends js.Object {
  var handlerProvider: js.UndefOr[typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider] = js.native
  var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.native
  var operationLoader: js.UndefOr[OperationLoader] = js.native
  var operationTracker: js.UndefOr[OperationTracker] = js.native
}

object HandlerProvider {
  @scala.inline
  def apply(): HandlerProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerProvider]
  }
  @scala.inline
  implicit class HandlerProviderOps[Self <: HandlerProvider] (val x: Self) extends AnyVal {
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
    def setHandlerProvider(value: /* handle */ String => js.Any): Self = this.set("handlerProvider", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandlerProvider: Self = this.set("handlerProvider", js.undefined)
    @scala.inline
    def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = this.set("missingFieldHandlers", js.Array(value :_*))
    @scala.inline
    def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = this.set("missingFieldHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingFieldHandlers: Self = this.set("missingFieldHandlers", js.undefined)
    @scala.inline
    def setOperationLoader(value: OperationLoader): Self = this.set("operationLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationLoader: Self = this.set("operationLoader", js.undefined)
    @scala.inline
    def setOperationTracker(value: OperationTracker): Self = this.set("operationTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationTracker: Self = this.set("operationTracker", js.undefined)
  }
  
}

