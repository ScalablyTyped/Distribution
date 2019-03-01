package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of timeouts in which the socket auto-closes if it 
    * has been inactive. (default 10; 1 to auto-close after a 
    * single timeout).
    */
  var socketTimeoutsToClose: scala.Double
}

object TcpOptions {
  @scala.inline
  def apply(
    socketTimeoutsToClose: scala.Double,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    socketTimeout: scala.Int | scala.Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[scala.Boolean] = js.undefined
  ): TcpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("socketTimeoutsToClose")(socketTimeoutsToClose)
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

