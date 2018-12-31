package typings
package reconnectDashCoreLib.reconnectDashCoreMod.reconnectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ConnectionType]
  extends backoffLib.backoffMod.ExponentialOptions {
  var failAfter: js.UndefOr[scala.Double] = js.undefined
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, scala.Unit]] = js.undefined
  var strategy: js.UndefOr[
    reconnectDashCoreLib.reconnectDashCoreLibStrings.fibonacci | reconnectDashCoreLib.reconnectDashCoreLibStrings.exponential | backoffLib.backoffMod.Backoff
  ] = js.undefined
}

