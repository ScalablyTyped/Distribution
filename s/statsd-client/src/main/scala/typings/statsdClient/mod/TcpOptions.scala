package typings.statsdClient.mod

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
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    socketTimeout: js.UndefOr[Double] = js.undefined,
    tags: Tags = null,
    tcp: js.UndefOr[Boolean] = js.undefined
  ): TcpOptions = {
    val __obj = js.Dynamic.literal(socketTimeoutsToClose = socketTimeoutsToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(tcp)) __obj.updateDynamic("tcp")(tcp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpOptions]
  }
}

