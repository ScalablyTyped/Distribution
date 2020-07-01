package typings.relayRuntime.relayModernEnvironmentMod

import typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider
import typings.relayRuntime.relayModernQueryExecutorMod.TaskScheduler
import typings.relayRuntime.relayNetworkTypesMod.Network
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.LogFunction
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
  val isServer: js.UndefOr[Boolean] = js.undefined
  val log: js.UndefOr[LogFunction | Null] = js.undefined
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler] | Null] = js.undefined
  val network: Network
  val operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
  val operationTracker: js.UndefOr[OperationTracker | Null] = js.undefined
  val options: js.UndefOr[js.Any] = js.undefined
  val scheduler: js.UndefOr[TaskScheduler | Null] = js.undefined
  val store: Store
  val treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.undefined
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: String = null,
    handlerProvider: js.UndefOr[Null | (/* handle */ String => js.Any)] = js.undefined,
    isServer: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Null | (/* logEvent */ LogEvent => Unit)] = js.undefined,
    missingFieldHandlers: js.UndefOr[Null | js.Array[MissingFieldHandler]] = js.undefined,
    operationLoader: js.UndefOr[Null | OperationLoader] = js.undefined,
    operationTracker: js.UndefOr[Null | OperationTracker] = js.undefined,
    options: js.Any = null,
    scheduler: js.UndefOr[Null | TaskScheduler] = js.undefined,
    treatMissingFieldsAsNull: js.UndefOr[Boolean] = js.undefined
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (configName != null) __obj.updateDynamic("configName")(configName.asInstanceOf[js.Any])
    if (!js.isUndefined(handlerProvider)) __obj.updateDynamic("handlerProvider")(if (handlerProvider != null) js.Any.fromFunction1(handlerProvider.asInstanceOf[/* handle */ String => js.Any]) else null)
    if (!js.isUndefined(isServer)) __obj.updateDynamic("isServer")(isServer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(if (log != null) js.Any.fromFunction1(log.asInstanceOf[/* logEvent */ LogEvent => Unit]) else null)
    if (!js.isUndefined(missingFieldHandlers)) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(operationLoader)) __obj.updateDynamic("operationLoader")(operationLoader.asInstanceOf[js.Any])
    if (!js.isUndefined(operationTracker)) __obj.updateDynamic("operationTracker")(operationTracker.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(scheduler)) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    if (!js.isUndefined(treatMissingFieldsAsNull)) __obj.updateDynamic("treatMissingFieldsAsNull")(treatMissingFieldsAsNull.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

