package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonOptions extends js.Object {
  /**
       * Print what is being sent to stderr (default false).
       */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Prefix all stats with this value (default "").
       */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Dual-use timer. Will flush metrics every interval. For UDP, 
       * it auto-closes the socket after this long without activity 
       * (default 1000 ms; 0 disables this). For TCP, it auto-closes 
       * the socket after socketTimeoutsToClose number of timeouts 
       * have elapsed without activity.
       */
  var socketTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
       * Object of string key/value pairs which will be appended on 
       * to all StatsD payloads (excluding raw payloads)
       * (default {})
       */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
       * User specifically wants to use tcp (default false)
       */
  var tcp: js.UndefOr[scala.Boolean] = js.undefined
}

