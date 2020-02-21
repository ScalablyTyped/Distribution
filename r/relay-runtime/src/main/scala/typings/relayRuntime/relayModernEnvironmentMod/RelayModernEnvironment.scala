package typings.relayRuntime.relayModernEnvironmentMod

import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayModernEnvironment", "RelayModernEnvironment")
@js.native
class RelayModernEnvironment protected () extends Environment {
  def this(config: EnvironmentConfig) = this()
  var configName: js.UndefOr[String | Null] = js.native
  def replaceUpdate(update: OptimisticUpdateFunction, newUpdate: OptimisticUpdateFunction): Unit = js.native
  def revertUpdate(update: OptimisticUpdateFunction): Unit = js.native
}

