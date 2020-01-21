package typings.relayRuntime.relayModernEnvironmentMod

import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayStoreTypesMod.LoggerProvider
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import typings.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentConfig extends js.Object {
  val configName: js.UndefOr[String] = js.undefined
  val handlerProvider: js.UndefOr[HandlerProvider | Null] = js.undefined
  val loggerProvider: js.UndefOr[LoggerProvider | Null] = js.undefined
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
  val network: Network
  val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
  val operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
  val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
  val store: Store
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: String = null,
    handlerProvider: /* handle */ String => js.Any = null,
    loggerProvider: LoggerProvider = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null,
    operationTracker: OperationTracker = null,
    scheduler: TaskScheduler = null
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(js.Any.fromFunction1(handlerProvider))
    if (loggerProvider != null) __obj.updateDynamic("loggerProvider")(loggerProvider.asInstanceOf[js.Any])
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers.asInstanceOf[js.Any])
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    if (operationTracker != null) __obj.updateDynamic("operationTracker")(operationTracker.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

