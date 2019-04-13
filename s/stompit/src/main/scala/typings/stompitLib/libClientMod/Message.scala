package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message
  extends stompitLib.libIncomingFrameStreamMod.IncomingFrame {
  def ack(): scala.Unit = js.native
  def nack(): scala.Unit = js.native
}

