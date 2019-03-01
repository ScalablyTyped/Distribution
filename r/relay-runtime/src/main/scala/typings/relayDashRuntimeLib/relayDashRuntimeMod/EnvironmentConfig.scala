package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentConfig extends js.Object {
  var configName: js.UndefOr[java.lang.String] = js.undefined
  var handlerProvider: js.UndefOr[HandlerProvider] = js.undefined
  var network: Network
  var store: Store
}

object EnvironmentConfig {
  @scala.inline
  def apply(
    network: Network,
    store: Store,
    configName: java.lang.String = null,
    handlerProvider: HandlerProvider = null
  ): EnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("network")(network)
    __obj.updateDynamic("store")(store)
    if (configName != null) __obj.updateDynamic("configName")(configName)
    if (handlerProvider != null) __obj.updateDynamic("handlerProvider")(handlerProvider)
    __obj.asInstanceOf[EnvironmentConfig]
  }
}

