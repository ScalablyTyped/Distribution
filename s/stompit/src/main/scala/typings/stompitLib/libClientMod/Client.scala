package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends stompitLib.libSocketMod.namespaced {
  def ack(message: stompitLib.libClientMod.ClientNs.Message): scala.Unit = js.native
  def ack(message: stompitLib.libClientMod.ClientNs.Message, headers: js.Any): scala.Unit = js.native
  def ack(
    message: stompitLib.libClientMod.ClientNs.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.ClientNs.SendOptions
  ): scala.Unit = js.native
  def ack(
    message: stompitLib.libClientMod.ClientNs.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.ClientNs.SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def begin(): stompitLib.libClientTransactionMod.namespaced = js.native
  def begin(headers: js.Any): stompitLib.libClientTransactionMod.namespaced = js.native
  def connect(): scala.Unit = js.native
  def connect(headers: js.Any): scala.Unit = js.native
  def connect(
    headers: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* client */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* client */ this.type, scala.Unit]): scala.Unit = js.native
  def getOptions(): stompitLib.libSocketMod.SocketNs.SocketOptions = js.native
  def getSubscription(id: scala.Double): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def nack(message: stompitLib.libClientMod.ClientNs.Message): scala.Unit = js.native
  def nack(message: stompitLib.libClientMod.ClientNs.Message, headers: js.Any): scala.Unit = js.native
  def nack(
    message: stompitLib.libClientMod.ClientNs.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.ClientNs.SendOptions
  ): scala.Unit = js.native
  def nack(
    message: stompitLib.libClientMod.ClientNs.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.ClientNs.SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def readEmptyBody(frame: stompitLib.libIncomingFrameStreamMod.namespaced): scala.Unit = js.native
  def readEmptyBody(
    frame: stompitLib.libIncomingFrameStreamMod.namespaced,
    callback: js.Function1[/* client */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def send(): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any, options: stompitLib.libClientMod.ClientNs.SendOptions): nodeLib.streamMod.Writable = js.native
  def sendFrame(command: java.lang.String, headers: js.Any, options: stompitLib.libClientMod.ClientNs.SendOptions): nodeLib.streamMod.Writable = js.native
  def sendString(): scala.Unit = js.native
  def sendString(headers: js.Any): scala.Unit = js.native
  def sendString(headers: js.Any, body: js.Any): scala.Unit = js.native
  def sendString(headers: js.Any, body: js.Any, options: stompitLib.libClientMod.ClientNs.SendOptions): scala.Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: stompitLib.libClientMod.ClientNs.SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def setImplicitSubscription(id: scala.Double): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def setImplicitSubscription(id: scala.Double, ack: stompitLib.libClientMod.ClientNs.Ack): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def setImplicitSubscription(
    id: scala.Double,
    ack: stompitLib.libClientMod.ClientNs.Ack,
    messageListener: stompitLib.libClientMod.ClientNs.MessageCallback
  ): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def subscribe(): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def subscribe(headers: js.Any): stompitLib.libClientSubscriptionMod.namespaced = js.native
  def subscribe(headers: js.Any, messageListener: stompitLib.libClientMod.ClientNs.MessageCallback): stompitLib.libClientSubscriptionMod.namespaced = js.native
}

