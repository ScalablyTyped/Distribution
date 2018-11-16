package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LimiterInfo extends js.Object {
  /**
       * Number of calls left in current duration without decreasing current get
       */
  var remaining: scala.Double
  /**
       * Time in milliseconds until the end of current duration
       */
  var reset: scala.Double
  /**
       * max value
       */
  var total: scala.Double
}

