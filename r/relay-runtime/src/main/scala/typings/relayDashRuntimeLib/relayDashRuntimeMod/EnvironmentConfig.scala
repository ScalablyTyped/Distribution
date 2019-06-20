package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Core API
// ./RelayModernEnvironment
trait EnvironmentConfig extends js.Object {
  val configName: js.UndefOr[java.lang.String] = js.undefined
  val handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
  val missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.undefined
  val network: Network
  val operationLoader: js.UndefOr[OperationLoader] = js.undefined
  val store: Store
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: java.lang.String = null,
    handlerProvider: HandlerProvider = null,
    missingFieldHandlers: js.Array[MissingFieldHandler] = null,
    operationLoader: OperationLoader = null
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal(network = network, store = store)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(handlerProvider)
    if (missingFieldHandlers != null) __obj.updateDynamic("missingFieldHandlers")(missingFieldHandlers)
    if (operationLoader != null) __obj.updateDynamic("operationLoader")(operationLoader)
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

