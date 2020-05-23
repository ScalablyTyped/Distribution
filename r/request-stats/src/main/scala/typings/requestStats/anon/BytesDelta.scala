package typings.requestStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesDelta extends js.Object {
  /**
    * Total bytes received
    */
  var bytes: Double
  /**
    * Bytes received since previous call to `.progress()`
    */
  var bytesDelta: Double
  /**
    * If the request contains a Content-Size header
    */
  var bytesLeft: Double
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double
  /**
    * If the request contains a Content-Size header
    */
  var timeLeft: Double
}

object BytesDelta {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, bytesLeft: Double, speed: Double, timeLeft: Double): BytesDelta = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], bytesLeft = bytesLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesDelta]
  }
}

