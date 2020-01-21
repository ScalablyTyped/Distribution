package typings.relayRuntime.mod

import typings.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typings.relayRuntime.relayModernEnvironmentMod.RelayModernEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends RelayModernEnvironment {
  def this(config: EnvironmentConfig) = this()
}

