package typings.relayDashRuntime.libStoreRelayModernEnvironmentMod

import typings.relayDashRuntime.libHandlersRelayDefaultHandlerProviderMod.HandlerProvider
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.Network
import typings.relayDashRuntime.libStoreRelayModernQueryExecutorMod.TaskScheduler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.LogFunction
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.LoggerProvider
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MissingFieldHandler
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationLoader
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationTracker
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentConfig extends js.Object {
  var configName: js.UndefOr[String] = js.undefined
  var handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
  var log: js.UndefOr[LogFunction] = js.undefined
  var loggerProvider: js.UndefOr[LoggerProvider] = js.undefined
  var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.undefined
  var network: Network
  var operationLoader: js.UndefOr[OperationLoader] = js.undefined
  var operationTracker: js.UndefOr[OperationTracker] = js.undefined
  var scheduler: js.UndefOr[TaskScheduler] = js.undefined
  var store: Store
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: String = null,
    handlerProvider: HandlerProvider = null,
    log: LogFunction = null,
    loggerProvider: LoggerProvider = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null,
    operationTracker: OperationTracker = null,
    scheduler: TaskScheduler = null
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network, store = store)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(handlerProvider)
    if (log != null) __obj.updateDynamic("log")(log)
    if (loggerProvider != null) __obj.updateDynamic("loggerProvider")(loggerProvider)
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers)
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader)
    if (operationTracker != null) __obj.updateDynamic("operationTracker")(operationTracker)
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler)
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

