package typings
package reconnectDashCoreLib.reconnectDashCoreMod

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

object ModuleOptions {
  @scala.inline
  def apply[ConnectionType](
    factor: scala.Int | scala.Double = null,
    failAfter: scala.Int | scala.Double = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    initialDelay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    onConnect: /* con */ ConnectionType => scala.Unit = null,
    randomisationFactor: scala.Int | scala.Double = null,
    strategy: reconnectDashCoreLib.reconnectDashCoreLibStrings.fibonacci | reconnectDashCoreLib.reconnectDashCoreLibStrings.exponential | backoffLib.backoffMod.Backoff = null
  ): ModuleOptions[ConnectionType] = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (failAfter != null) __obj.updateDynamic("failAfter")(failAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1(onConnect))
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ConnectionType]]
  }
}

