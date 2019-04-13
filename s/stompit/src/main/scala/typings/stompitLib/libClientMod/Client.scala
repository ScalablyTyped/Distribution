package typings
package stompitLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends stompitLib.libSocketMod.^ {
  def ack(message: Message): scala.Unit = js.native
  def ack(message: Message, headers: js.Any): scala.Unit = js.native
  def ack(message: Message, headers: js.Any, sendOptions: SendOptions): scala.Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def begin(): stompitLib.libClientTransactionMod.^ = js.native
  def begin(headers: js.Any): stompitLib.libClientTransactionMod.^ = js.native
  def connect(): scala.Unit = js.native
  def connect(headers: js.Any): scala.Unit = js.native
  def connect(
    headers: js.Any,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* client */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* client */ this.type, scala.Unit]): scala.Unit = js.native
  def getOptions(): stompitLib.libSocketMod.SocketOptions = js.native
  def getSubscription(id: scala.Double): stompitLib.libClientSubscriptionMod.^ = js.native
  def nack(message: Message): scala.Unit = js.native
  def nack(message: Message, headers: js.Any): scala.Unit = js.native
  def nack(message: Message, headers: js.Any, sendOptions: SendOptions): scala.Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def readEmptyBody(frame: stompitLib.libIncomingFrameStreamMod.^): scala.Unit = js.native
  def readEmptyBody(
    frame: stompitLib.libIncomingFrameStreamMod.^,
    callback: js.Function1[/* client */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def send(): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any, options: SendOptions): nodeLib.streamMod.Writable = js.native
  def sendFrame(command: java.lang.String, headers: js.Any, options: SendOptions): nodeLib.streamMod.Writable = js.native
  def sendString(): scala.Unit = js.native
  def sendString(headers: js.Any): scala.Unit = js.native
  def sendString(headers: js.Any, body: js.Any): scala.Unit = js.native
  def sendString(headers: js.Any, body: js.Any, options: SendOptions): scala.Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def setImplicitSubscription(id: scala.Double): stompitLib.libClientSubscriptionMod.^ = js.native
  def setImplicitSubscription(id: scala.Double, ack: Ack): stompitLib.libClientSubscriptionMod.^ = js.native
  def setImplicitSubscription(id: scala.Double, ack: Ack, messageListener: MessageCallback): stompitLib.libClientSubscriptionMod.^ = js.native
  def subscribe(): stompitLib.libClientSubscriptionMod.^ = js.native
  def subscribe(headers: js.Any): stompitLib.libClientSubscriptionMod.^ = js.native
  def subscribe(headers: js.Any, messageListener: MessageCallback): stompitLib.libClientSubscriptionMod.^ = js.native
}

