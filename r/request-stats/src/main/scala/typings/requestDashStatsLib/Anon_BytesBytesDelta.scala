package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesBytesDelta extends js.Object {
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

object Anon_BytesBytesDelta {
  @scala.inline
  def apply(
    bytes: scala.Double,
    bytesDelta: scala.Double,
    bytesLeft: scala.Double,
    speed: scala.Double,
    timeLeft: scala.Double
  ): Anon_BytesBytesDelta = {
    val __obj = js.Dynamic.literal(bytes = bytes, bytesDelta = bytesDelta, bytesLeft = bytesLeft, speed = speed, timeLeft = timeLeft)
  
    __obj.asInstanceOf[Anon_BytesBytesDelta]
  }
}

