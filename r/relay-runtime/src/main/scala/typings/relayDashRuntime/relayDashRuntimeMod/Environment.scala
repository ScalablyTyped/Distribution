package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libStoreRelayModernEnvironmentMod.EnvironmentConfig
import typings.relayDashRuntime.libStoreRelayModernEnvironmentMod.RelayModernEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends RelayModernEnvironment {
  def this(config: EnvironmentConfig) = this()
}

