package typings.sccBrokerClient.clientPoolMod

import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.anon.Error
import typings.sccBrokerClient.sccBrokerClientStrings.error
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.publishFail
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typings.socketclusterClient.clientsocketMod.SubscribeOptions
import typings.socketclusterClient.mod.AGClientSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: Double = js.native
  var clients: js.Array[AGClientSocket] = js.native
  var hasher: typings.sccBrokerClient.hasherMod.^ = js.native
  var targetURI: String = js.native
  def breakDownURI(uri: String): BrokenDownURI = js.native
  def closeChannel(channelName: String): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
  def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  @JSName("listener")
  def listener_error(eventName: error): typings.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typings.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(eventName: subscribeFail): typings.consumableStream.mod.^[SubscribeFailData] = js.native
  def selectClient(key: String): AGClientSocket = js.native
  def subscribe(channelName: String): typings.agChannel.mod.^[_] = js.native
  def subscribe(channelName: String, options: SubscribeOptions): typings.agChannel.mod.^[_] = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unsubscribe(channelName: String): js.Promise[Unit] = js.native
}

