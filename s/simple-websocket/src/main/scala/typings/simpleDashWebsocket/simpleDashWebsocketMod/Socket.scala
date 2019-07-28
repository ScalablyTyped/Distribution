package typings.simpleDashWebsocket.simpleDashWebsocketMod

import typings.node.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends Duplex {
  def destroy(err: Error): Unit = js.native
  /** Send text/binary data to the WebSocket server */
  def send(chunk: js.Any): Unit = js.native
}

