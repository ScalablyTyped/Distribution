package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11Details extends js.Object {
  /** The originating IP of the connection. */
  var srcIP: java.lang.String
  /** The originating port of the connection. */
  var srcPort: scala.Double
}

object X11Details {
  @scala.inline
  def apply(srcIP: java.lang.String, srcPort: scala.Double): X11Details = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("srcIP")(srcIP)
    __obj.updateDynamic("srcPort")(srcPort)
    __obj.asInstanceOf[X11Details]
  }
}

