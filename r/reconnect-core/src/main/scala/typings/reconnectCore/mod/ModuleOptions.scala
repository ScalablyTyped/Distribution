package typings.reconnectCore.mod

import typings.backoff.mod.Backoff
import typings.backoff.mod.ExponentialOptions
import typings.reconnectCore.reconnectCoreStrings.exponential
import typings.reconnectCore.reconnectCoreStrings.fibonacci
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ConnectionType] extends ExponentialOptions {
  var failAfter: js.UndefOr[Double] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
  var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.undefined
  var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[ConnectionType](
    factor: js.UndefOr[Double] = js.undefined,
    failAfter: js.UndefOr[Double] = js.undefined,
    immediate: js.UndefOr[Boolean] = js.undefined,
    initialDelay: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    onConnect: /* con */ ConnectionType => Unit = null,
    randomisationFactor: js.UndefOr[Double] = js.undefined,
    strategy: fibonacci | exponential | Backoff = null
  ): ModuleOptions[ConnectionType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failAfter)) __obj.updateDynamic("failAfter")(failAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1(onConnect))
    if (!js.isUndefined(randomisationFactor)) __obj.updateDynamic("randomisationFactor")(randomisationFactor.get.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ConnectionType]]
  }
}

