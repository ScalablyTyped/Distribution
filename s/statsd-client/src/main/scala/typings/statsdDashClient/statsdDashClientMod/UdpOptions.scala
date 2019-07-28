package typings.statsdDashClient.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UdpOptions extends CommonOptions {
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Port to contact the statsd-daemon on (default 8125).
    */
  var port: js.UndefOr[Double] = js.undefined
}

object UdpOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: Int | Double = null,
    prefix: String = null,
    socketTimeout: Int | Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[Boolean] = js.undefined
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

