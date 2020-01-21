package typings.requestStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesBytesDeltaSpeed extends js.Object {
  /**
    * Total bytes send back to the client
    */
  var bytes: Double
  /**
    * Bytes sent back to the client since previous call to `.progress()`
    */
  var bytesDelta: Double
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double
}

object AnonBytesBytesDeltaSpeed {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, speed: Double): AnonBytesBytesDeltaSpeed = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesBytesDeltaSpeed]
  }
}

