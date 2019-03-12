package typings
package stompitLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.eventsMod.EventEmitter {
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
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def begin(): stompitLib.libClientTransactionMod.namespaced = js.native
  def begin(headers: js.Any): stompitLib.libClientTransactionMod.namespaced = js.native
  def close(error: stdLib.Error): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def lock(): scala.Unit = js.native
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
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def send(headers: js.Any, body: stompitLib.libChannelMod.ChannelNs.Body): this.type = js.native
  def send(
    headers: js.Any,
    body: stompitLib.libChannelMod.ChannelNs.Body,
    callback: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): this.type = js.native
  def setImplicitSubscription(id: scala.Double): stompitLib.libChannelMod.ChannelNs.ChannelSubscription = js.native
  def setImplicitSubscription(id: scala.Double, ack: stompitLib.libClientMod.ClientNs.Ack): stompitLib.libChannelMod.ChannelNs.ChannelSubscription = js.native
  def setImplicitSubscription(
    id: scala.Double,
    ack: stompitLib.libClientMod.ClientNs.Ack,
    msgListener: stompitLib.libClientMod.ClientNs.MessageCallback
  ): stompitLib.libChannelMod.ChannelNs.ChannelSubscription = js.native
  def subscribe(
    headers: js.Any,
    onMessageCallback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* message */ stompitLib.libClientMod.ClientNs.Message, 
      /* channelSubscription */ stompitLib.libChannelMod.ChannelNs.ChannelSubscription, 
      scala.Unit
    ]
  ): stompitLib.libChannelMod.ChannelNs.ChannelSubscription = js.native
  def unlock(): scala.Unit = js.native
}

