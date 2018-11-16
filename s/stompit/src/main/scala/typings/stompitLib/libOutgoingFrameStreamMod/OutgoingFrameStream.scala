package typings
package stompitLib.libOutgoingFrameStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingFrameStream extends js.Object {
  def finish(): scala.Unit = js.native
  def frame(command: java.lang.String): nodeLib.streamMod.Writable = js.native
  def frame(command: java.lang.String, headers: js.Any): nodeLib.streamMod.Writable = js.native
  def frame(
    command: java.lang.String,
    headers: js.Any,
    streamOptions: nodeLib.streamMod.internalNs.WritableOptions
  ): nodeLib.streamMod.Writable = js.native
  def hasFinished(): scala.Boolean = js.native
  def heartbeat(): scala.Unit = js.native
  def setVersion(versionId: java.lang.String): scala.Boolean = js.native
}

