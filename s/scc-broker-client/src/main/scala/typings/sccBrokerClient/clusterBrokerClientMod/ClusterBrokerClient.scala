package typings.sccBrokerClient.clusterBrokerClientMod

import typings.jsonwebtoken.mod.Secret
import typings.node.eventsMod.EventEmitter
import typings.sccBrokerClient.clientPoolMod.PublishData
import typings.sccBrokerClient.clientPoolMod.SubscribeData
import typings.sccBrokerClient.clientPoolMod.SubscribeFailData
import typings.sccBrokerClient.mod.MappingEngine
import typings.sccBrokerClient.sccBrokerClientStrings.error
import typings.sccBrokerClient.sccBrokerClientStrings.message
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.publishFail
import typings.sccBrokerClient.sccBrokerClientStrings.simple
import typings.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerClient extends EventEmitter {
  var authKey: js.UndefOr[Secret] = js.native
  var broker: typings.scBroker.scbrokerMod.^ = js.native
  var clientPoolSize: Double = js.native
  var mapper: MappingEngine = js.native
  var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
  var sccBrokerClientPools: js.Array[typings.sccBrokerClient.clientPoolMod.^] = js.native
  var sccBrokerURIList: js.Array[String] = js.native
  def getAllSubscriptions(): js.Array[String] = js.native
  def mapChannelNameToBrokerURI(channelName: String): String = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* channelName */ String, /* packet */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_publish(event: publish, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_publishFail(event: publishFail, listener: js.Function1[/* data */ PublishData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* data */ SubscribeData, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribeFail(event: subscribeFail, listener: js.Function1[/* data */ SubscribeFailData, Unit]): this.type = js.native
  def publish(channelName: String, data: js.Any): Unit = js.native
  def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
  def subscribe(channelName: String): Unit = js.native
  def unsubscribe(channelName: String): Unit = js.native
}

