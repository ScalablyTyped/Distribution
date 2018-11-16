package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TcpConnectionDetails extends js.Object {
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: java.lang.String
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: scala.Double
  /** The originating IP of the connection. */
  var srcIP: java.lang.String
  /** The originating port of the connection. */
  var srcPort: scala.Double
}

