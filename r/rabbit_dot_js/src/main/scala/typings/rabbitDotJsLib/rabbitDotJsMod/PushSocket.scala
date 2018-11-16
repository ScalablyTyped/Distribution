package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rabbit.js", "PushSocket")
@js.native
class PushSocket protected ()
  extends nodeLib.streamMod.Writable
     with Socket {
  def this(channel: java.lang.String, opts: SocketOptions) = this()
}

