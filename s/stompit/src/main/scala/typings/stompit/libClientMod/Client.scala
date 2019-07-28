package typings.stompit.libClientMod

import typings.node.streamMod.Writable
import typings.std.Error
import typings.stompit.libSocketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends typings.stompit.libSocketMod.^ {
  def ack(message: Message): Unit = js.native
  def ack(message: Message, headers: js.Any): Unit = js.native
  def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def begin(): typings.stompit.libClientTransactionMod.^ = js.native
  def begin(headers: js.Any): typings.stompit.libClientTransactionMod.^ = js.native
  def connect(): Unit = js.native
  def connect(headers: js.Any): Unit = js.native
  def connect(headers: js.Any, callback: js.Function2[/* err */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function2[/* error */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
  def getOptions(): SocketOptions = js.native
  def getSubscription(id: Double): typings.stompit.libClientSubscriptionMod.^ = js.native
  def nack(message: Message): Unit = js.native
  def nack(message: Message, headers: js.Any): Unit = js.native
  def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def readEmptyBody(frame: typings.stompit.libIncomingFrameStreamMod.^): Unit = js.native
  def readEmptyBody(
    frame: typings.stompit.libIncomingFrameStreamMod.^,
    callback: js.Function1[/* client */ this.type, Unit]
  ): Unit = js.native
  def send(): Writable = js.native
  def send(headers: js.Any): Writable = js.native
  def send(headers: js.Any, options: SendOptions): Writable = js.native
  def sendFrame(command: String, headers: js.Any, options: SendOptions): Writable = js.native
  def sendString(): Unit = js.native
  def sendString(headers: js.Any): Unit = js.native
  def sendString(headers: js.Any, body: js.Any): Unit = js.native
  def sendString(headers: js.Any, body: js.Any, options: SendOptions): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def setImplicitSubscription(id: Double): typings.stompit.libClientSubscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack): typings.stompit.libClientSubscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typings.stompit.libClientSubscriptionMod.^ = js.native
  def subscribe(): typings.stompit.libClientSubscriptionMod.^ = js.native
  def subscribe(headers: js.Any): typings.stompit.libClientSubscriptionMod.^ = js.native
  def subscribe(headers: js.Any, messageListener: MessageCallback): typings.stompit.libClientSubscriptionMod.^ = js.native
}

