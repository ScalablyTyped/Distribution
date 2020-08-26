package typings.stompit.channelMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.stompit.clientMod.Ack
import typings.stompit.clientMod.Message
import typings.stompit.clientMod.MessageCallback
import typings.stompit.clientMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends EventEmitter {
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
  def close(error: Error): Unit = js.native
  def isEmpty(): Boolean = js.native
  def lock(): Unit = js.native
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
  def send(headers: js.Any, body: Body): this.type = js.native
  def send(headers: js.Any, body: Body, callback: js.Function1[/* err */ Error | Null, Unit]): this.type = js.native
  def setImplicitSubscription(id: Double): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: js.UndefOr[scala.Nothing], msgListener: MessageCallback): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: Ack): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: Ack, msgListener: MessageCallback): ChannelSubscription = js.native
  def subscribe(
    headers: js.Any,
    onMessageCallback: js.Function3[
      /* err */ Error | Null, 
      /* message */ Message, 
      /* channelSubscription */ ChannelSubscription, 
      Unit
    ]
  ): ChannelSubscription = js.native
  def unlock(): Unit = js.native
}

