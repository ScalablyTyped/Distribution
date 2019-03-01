package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UdpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[scala.Double] = js.undefined
}

object UdpOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    socketTimeout: scala.Int | scala.Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[scala.Boolean] = js.undefined
  ): UdpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tcp)) __obj.updateDynamic("tcp")(tcp)
    __obj.asInstanceOf[UdpOptions]
  }
}

