package typings.relayDashTestDashUtils

import typings.relayDashRuntime.libHandlersRelayDefaultHandlerProviderMod.HandlerProvider
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerProvider extends js.Object {
  var handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
  var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.undefined
  var operationLoader: js.UndefOr[OperationLoader] = js.undefined
  var operationTracker: js.UndefOr[OperationTracker] = js.undefined
}

object Anon_HandlerProvider {
  @scala.inline
  def apply(
    handlerProvider: HandlerProvider = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null,
    operationTracker: OperationTracker = null
  ): Anon_HandlerProvider = {
    val __obj = js.Dynamic.literal()
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(handlerProvider)
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers)
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader)
    if (operationTracker != null) __obj.updateDynamic("operationTracker")(operationTracker)
    __obj.asInstanceOf[Anon_HandlerProvider]
  }
}

