package typings
package stompitLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.eventsMod.EventEmitter {
  def ack(message: stompitLib.libClientMod.Message): scala.Unit = js.native
  def ack(message: stompitLib.libClientMod.Message, headers: js.Any): scala.Unit = js.native
  def ack(
    message: stompitLib.libClientMod.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.SendOptions
  ): scala.Unit = js.native
  def ack(
    message: stompitLib.libClientMod.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def begin(): stompitLib.libClientTransactionMod.^ = js.native
  def begin(headers: js.Any): stompitLib.libClientTransactionMod.^ = js.native
  def close(error: stdLib.Error): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def lock(): scala.Unit = js.native
  def nack(message: stompitLib.libClientMod.Message): scala.Unit = js.native
  def nack(message: stompitLib.libClientMod.Message, headers: js.Any): scala.Unit = js.native
  def nack(
    message: stompitLib.libClientMod.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.SendOptions
  ): scala.Unit = js.native
  def nack(
    message: stompitLib.libClientMod.Message,
    headers: js.Any,
    sendOptions: stompitLib.libClientMod.SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def send(headers: js.Any, body: Body): this.type = js.native
  def send(
    headers: js.Any,
    body: Body,
    callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): this.type = js.native
  def setImplicitSubscription(id: scala.Double): ChannelSubscription = js.native
  def setImplicitSubscription(id: scala.Double, ack: stompitLib.libClientMod.Ack): ChannelSubscription = js.native
  def setImplicitSubscription(
    id: scala.Double,
    ack: stompitLib.libClientMod.Ack,
    msgListener: stompitLib.libClientMod.MessageCallback
  ): ChannelSubscription = js.native
  def subscribe(
    headers: js.Any,
    onMessageCallback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* message */ stompitLib.libClientMod.Message, 
      /* channelSubscription */ ChannelSubscription, 
      scala.Unit
    ]
  ): ChannelSubscription = js.native
  def unlock(): scala.Unit = js.native
}

