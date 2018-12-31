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

