package typings
package simpleDashWebsocketLib.simpleDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends nodeLib.streamMod.Duplex {
  def destroy(err: stdLib.Error): scala.Unit = js.native
  /** Send text/binary data to the WebSocket server */
  def send(chunk: js.Any): scala.Unit = js.native
}

