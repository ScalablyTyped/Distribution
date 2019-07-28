package typings.statsdDashClient.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Number of timeouts in which the socket auto-closes if it 
    * has been inactive. (default 10; 1 to auto-close after a 
    * single timeout).
    */
  var socketTimeoutsToClose: Double
}

object TcpOptions {
  @scala.inline
  def apply(
    socketTimeoutsToClose: Double,
    debug: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: Int | Double = null,
    prefix: String = null,
    socketTimeout: Int | Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[Boolean] = js.undefined
  ): TcpOptions = {
    val __obj = js.Dynamic.literal(socketTimeoutsToClose = socketTimeoutsToClose)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tcp)) __obj.updateDynamic("tcp")(tcp)
    __obj.asInstanceOf[TcpOptions]
  }
}

