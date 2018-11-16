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

