package typings
package stompitLib.libSocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SocketNs {
  type Heartbeat = js.Array[scala.Double]
  type commandHandler = js.Function1[/* frame */ nodeLib.streamMod.Writable, scala.Unit]
}
