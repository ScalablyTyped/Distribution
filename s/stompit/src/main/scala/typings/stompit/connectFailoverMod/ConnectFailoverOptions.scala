package typings.stompit.connectFailoverMod

import typings.stompit.connectMod.ConnectOptions
import typings.stompit.connectMod.ConnectionListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectFailoverOptions extends js.Object {
  // Override the connect function
  var connectFunction: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[ConnectionListener], 
      typings.stompit.clientMod.^
    ]
  ] = js.native
  // Milliseconds delay of the first reconnect
  var initialReconnectDelay: js.UndefOr[Double] = js.native
  // Maximum milliseconds delay of any reconnect
  var maxReconnectDelay: js.UndefOr[Double] = js.native
  // Maximum number of reconnects
  var maxReconnects: js.UndefOr[Double] = js.native
  // Randomly choose a server to use for reconnect
  var randomize: js.UndefOr[Boolean] = js.native
  // The exponent used in the exponential backoff attempts
  var reconnectDelayExponent: js.UndefOr[Double] = js.native
  // Exponential increase of the reconnect delay
  var useExponentialBackOff: js.UndefOr[Boolean] = js.native
}

object ConnectFailoverOptions {
  @scala.inline
  def apply(): ConnectFailoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailoverOptions]
  }
  @scala.inline
  implicit class ConnectFailoverOptionsOps[Self <: ConnectFailoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectFunction(
      value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[ConnectionListener]) => typings.stompit.clientMod.^
    ): Self = this.set("connectFunction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConnectFunction: Self = this.set("connectFunction", js.undefined)
    @scala.inline
    def setInitialReconnectDelay(value: Double): Self = this.set("initialReconnectDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialReconnectDelay: Self = this.set("initialReconnectDelay", js.undefined)
    @scala.inline
    def setMaxReconnectDelay(value: Double): Self = this.set("maxReconnectDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReconnectDelay: Self = this.set("maxReconnectDelay", js.undefined)
    @scala.inline
    def setMaxReconnects(value: Double): Self = this.set("maxReconnects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReconnects: Self = this.set("maxReconnects", js.undefined)
    @scala.inline
    def setRandomize(value: Boolean): Self = this.set("randomize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomize: Self = this.set("randomize", js.undefined)
    @scala.inline
    def setReconnectDelayExponent(value: Double): Self = this.set("reconnectDelayExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectDelayExponent: Self = this.set("reconnectDelayExponent", js.undefined)
    @scala.inline
    def setUseExponentialBackOff(value: Boolean): Self = this.set("useExponentialBackOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExponentialBackOff: Self = this.set("useExponentialBackOff", js.undefined)
  }
  
}

