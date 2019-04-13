package typings
package stompitLib.libSocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends nodeLib.eventsMod.EventEmitter {
  def createApplicationError(): SocketError = js.native
  def createApplicationError(message: java.lang.String): SocketError = js.native
  def createApplicationError(message: stdLib.Error): SocketError = js.native
  def createProtocolError(): SocketError = js.native
  def createProtocolError(message: java.lang.String): SocketError = js.native
  def createProtocolError(message: stdLib.Error): SocketError = js.native
  def createTransportError(): SocketError = js.native
  def createTransportError(message: java.lang.String): SocketError = js.native
  def createTransportError(message: stdLib.Error): SocketError = js.native
  def destroy(exception: stdLib.Error): scala.Unit = js.native
  def getHeartbeat(): Heartbeat = js.native
  def getTransportSocket(): nodeLib.streamMod.Duplex = js.native
  def hasFinishedOutput(): scala.Boolean = js.native
  def sendFrame(command: java.lang.String): nodeLib.streamMod.Writable = js.native
  def sendFrame(command: java.lang.String, headers: js.Any): nodeLib.streamMod.Writable = js.native
  def sendFrame(command: java.lang.String, headers: js.Any, streamOptions: nodeLib.streamMod.WritableOptions): nodeLib.streamMod.Writable = js.native
  def setCommandHandler(command: java.lang.String, handler: commandHandler): scala.Unit = js.native
  def setCommandHandlers(handlers: CommandHandlers): scala.Unit = js.native
  def setHeartbeat(heartbeat: Heartbeat): scala.Unit = js.native
  def setUnknownCommandHandler(handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def setVersion(version: java.lang.String): scala.Unit = js.native
}

