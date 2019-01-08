package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeLeft extends js.Object {
  /**
    * Total bytes received
    */
  var bytes: scala.Double
  /**
    * Bytes received since previous call to `.progress()`
    */
  var bytesDelta: scala.Double
  /**
    * If the request contains a Content-Size header
    */
  var bytesLeft: scala.Double
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: scala.Double
  /**
    * If the request contains a Content-Size header
    */
  var timeLeft: scala.Double
}

