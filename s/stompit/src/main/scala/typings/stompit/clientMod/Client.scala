package typings.stompit.clientMod

import typings.node.streamMod.Writable
import typings.std.Error
import typings.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client
  extends typings.stompit.socketMod.^ {
  
  def ack(message: Message): Unit = js.native
  def ack(
    message: Message,
    headers: js.UndefOr[scala.Nothing],
    sendOptions: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def ack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
  def ack(
    message: Message,
    headers: js.UndefOr[scala.Nothing],
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def ack(message: Message, headers: js.Any): Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  
  def begin(): typings.stompit.transactionMod.^ = js.native
  def begin(headers: js.Any): typings.stompit.transactionMod.^ = js.native
  
  def connect(): Unit = js.native
  def connect(
    headers: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* client */ this.type, Unit]
  ): Unit = js.native
  def connect(headers: js.Any): Unit = js.native
  def connect(headers: js.Any, callback: js.Function2[/* err */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function2[/* error */ Error | Null, /* client */ this.type, Unit]): Unit = js.native
  
  def getOptions(): SocketOptions = js.native
  
  def getSubscription(id: Double): typings.stompit.subscriptionMod.^ = js.native
  
  def nack(message: Message): Unit = js.native
  def nack(
    message: Message,
    headers: js.UndefOr[scala.Nothing],
    sendOptions: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def nack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
  def nack(
    message: Message,
    headers: js.UndefOr[scala.Nothing],
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def nack(message: Message, headers: js.Any): Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  
  def readEmptyBody(frame: typings.stompit.incomingFrameStreamMod.^): Unit = js.native
  def readEmptyBody(
    frame: typings.stompit.incomingFrameStreamMod.^,
    callback: js.Function1[/* client */ this.type, Unit]
  ): Unit = js.native
  
  def send(): Writable = js.native
  def send(headers: js.UndefOr[scala.Nothing], options: SendOptions): Writable = js.native
  def send(headers: js.Any): Writable = js.native
  def send(headers: js.Any, options: SendOptions): Writable = js.native
  
  def sendFrame(command: String, headers: js.UndefOr[scala.Nothing], options: SendOptions): Writable = js.native
  def sendFrame(command: String, headers: js.Any, options: SendOptions): Writable = js.native
  
  def sendString(): Unit = js.native
  def sendString(
    headers: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.UndefOr[scala.Nothing], body: js.UndefOr[scala.Nothing], options: SendOptions): Unit = js.native
  def sendString(
    headers: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.UndefOr[scala.Nothing], body: js.Any): Unit = js.native
  def sendString(
    headers: js.UndefOr[scala.Nothing],
    body: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.UndefOr[scala.Nothing], body: js.Any, options: SendOptions): Unit = js.native
  def sendString(
    headers: js.UndefOr[scala.Nothing],
    body: js.Any,
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.Any): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.Any, body: js.UndefOr[scala.Nothing], options: SendOptions): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.UndefOr[scala.Nothing],
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.Any, body: js.Any): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def sendString(headers: js.Any, body: js.Any, options: SendOptions): Unit = js.native
  def sendString(
    headers: js.Any,
    body: js.Any,
    options: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  
  def setImplicitSubscription(id: Double): typings.stompit.subscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: js.UndefOr[scala.Nothing], messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack): typings.stompit.subscriptionMod.^ = js.native
  def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
  
  def subscribe(): typings.stompit.subscriptionMod.^ = js.native
  def subscribe(headers: js.UndefOr[scala.Nothing], messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
  def subscribe(headers: js.Any): typings.stompit.subscriptionMod.^ = js.native
  def subscribe(headers: js.Any, messageListener: MessageCallback): typings.stompit.subscriptionMod.^ = js.native
}
