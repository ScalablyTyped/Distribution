package typings.requestDashStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesBytesDeltaSpeed extends js.Object {
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

object Anon_BytesBytesDeltaSpeed {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, speed: Double): Anon_BytesBytesDeltaSpeed = {
    val __obj = js.Dynamic.literal(bytes = bytes, bytesDelta = bytesDelta, speed = speed)
  
    __obj.asInstanceOf[Anon_BytesBytesDeltaSpeed]
  }
}

