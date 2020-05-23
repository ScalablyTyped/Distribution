package typings.stompit.connectFailoverMod

import typings.std.Error
import typings.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[
        js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
      ], 
      typings.stompit.clientMod.^
    ]
  ] = js.undefined
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[Double] = js.undefined
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[Double] = js.undefined
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[Double] = js.undefined
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[Boolean] = js.undefined
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[Double] = js.undefined
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[Boolean] = js.undefined
}

object ConnectFailoverOptions {
  @scala.inline
  def apply(
    connectFunction: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[
      js.Function2[/* err */ Error | Null, /* client */ typings.stompit.clientMod.^, Unit]
    ]) => typings.stompit.clientMod.^ = null,
    initialReconnectDelay: js.UndefOr[Double] = js.undefined,
    maxReconnectDelay: js.UndefOr[Double] = js.undefined,
    maxReconnects: js.UndefOr[Double] = js.undefined,
    randomize: js.UndefOr[Boolean] = js.undefined,
    reconnectDelayExponent: js.UndefOr[Double] = js.undefined,
    useExponentialBackOff: js.UndefOr[Boolean] = js.undefined
  ): ConnectFailoverOptions = {
    val __obj = js.Dynamic.literal()
    if (connectFunction != null) __obj.updateDynamic("connectFunction")(js.Any.fromFunction2(connectFunction))
    if (!js.isUndefined(initialReconnectDelay)) __obj.updateDynamic("initialReconnectDelay")(initialReconnectDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReconnectDelay)) __obj.updateDynamic("maxReconnectDelay")(maxReconnectDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReconnects)) __obj.updateDynamic("maxReconnects")(maxReconnects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectDelayExponent)) __obj.updateDynamic("reconnectDelayExponent")(reconnectDelayExponent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useExponentialBackOff)) __obj.updateDynamic("useExponentialBackOff")(useExponentialBackOff.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectFailoverOptions]
  }
}

