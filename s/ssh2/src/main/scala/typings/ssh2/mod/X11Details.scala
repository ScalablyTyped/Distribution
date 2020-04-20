package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11Details extends js.Object {
  /** The originating IP of the connection. */
  var srcIP: String
  /** The originating port of the connection. */
  var srcPort: Double
}

object X11Details {
  @scala.inline
  def apply(srcIP: String, srcPort: Double): X11Details = {
    val __obj = js.Dynamic.literal(srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11Details]
  }
}

