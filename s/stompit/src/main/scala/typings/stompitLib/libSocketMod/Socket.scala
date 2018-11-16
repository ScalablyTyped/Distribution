package typings
package stompitLib.libSocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends nodeLib.eventsMod.EventEmitter {
  def createApplicationError(): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createApplicationError(message: java.lang.String): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createApplicationError(message: nodeLib.Error): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createProtocolError(): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createProtocolError(message: java.lang.String): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createProtocolError(message: nodeLib.Error): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createTransportError(): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createTransportError(message: java.lang.String): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def createTransportError(message: nodeLib.Error): stompitLib.libSocketMod.SocketNs.SocketError = js.native
  def destroy(exception: nodeLib.Error): scala.Unit = js.native
  def getHeartbeat(): stompitLib.libSocketMod.SocketNs.Heartbeat = js.native
  def getTransportSocket(): nodeLib.streamMod.Duplex = js.native
  def hasFinishedOutput(): scala.Boolean = js.native
  def sendFrame(command: java.lang.String): nodeLib.streamMod.Writable = js.native
  def sendFrame(command: java.lang.String, headers: js.Any): nodeLib.streamMod.Writable = js.native
  def sendFrame(
    command: java.lang.String,
    headers: js.Any,
    streamOptions: nodeLib.streamMod.internalNs.WritableOptions
  ): nodeLib.streamMod.Writable = js.native
  def setCommandHandler(command: java.lang.String, handler: stompitLib.libSocketMod.SocketNs.commandHandler): scala.Unit = js.native
  def setCommandHandlers(handlers: stompitLib.libSocketMod.SocketNs.CommandHandlers): scala.Unit = js.native
  def setHeartbeat(heartbeat: stompitLib.libSocketMod.SocketNs.Heartbeat): scala.Unit = js.native
  def setUnknownCommandHandler(handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def setVersion(version: java.lang.String): scala.Unit = js.native
}

