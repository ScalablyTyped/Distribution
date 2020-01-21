package typings.sccBrokerClient.clientPoolMod

import typings.jsonwebtoken.mod.Secret
import typings.node.eventsMod.EventEmitter
import typings.sccBrokerClient.sccBrokerClientStrings.error
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.publishFail
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool extends EventEmitter {
  var areClientListenersBound: Boolean = js.native
  var authKey: js.UndefOr[Secret] = js.native
  var clientCount: Double = js.native
  var clients: js.Array[typings.socketclusterClient.scclientsocketMod.^] = js.native
  var hasher: typings.sccBrokerClient.hasherMod.^ = js.native
  var targetURI: String = js.native
  def bindClientListeners(): Unit = js.native
  def breakDownURI(uri: String): BrokenDownURI = js.native
  def destroy(): Unit = js.native
  def destroyChannel(channelName: String): Unit = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_publish(event: publish, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_publishFail(event: publishFail, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* data */ SubscribeData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribeFail(event: subscribeFail, listener: js.Function1[/* data */ SubscribeFailData, Unit]): this.type = js.native
  def publish(channelName: String, data: js.Any): Unit = js.native
  def selectClient(key: String): typings.socketclusterClient.scclientsocketMod.^ = js.native
  def subscribeAndWatch(channelName: String, handler: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unbindClientListeners(): Unit = js.native
}

