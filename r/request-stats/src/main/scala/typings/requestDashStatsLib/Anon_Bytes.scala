package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bytes extends js.Object {
  /**
    * Total bytes send back to the client
    */
  var bytes: scala.Double
  /**
    * Bytes sent back to the client since previous call to `.progress()`
    */
  var bytesDelta: scala.Double
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: scala.Double
}

