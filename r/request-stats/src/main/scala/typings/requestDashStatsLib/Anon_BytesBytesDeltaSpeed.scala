package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesBytesDeltaSpeed extends js.Object {
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

object Anon_BytesBytesDeltaSpeed {
  @scala.inline
  def apply(bytes: scala.Double, bytesDelta: scala.Double, speed: scala.Double): Anon_BytesBytesDeltaSpeed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("bytesDelta")(bytesDelta)
    __obj.updateDynamic("speed")(speed)
    __obj.asInstanceOf[Anon_BytesBytesDeltaSpeed]
  }
}

