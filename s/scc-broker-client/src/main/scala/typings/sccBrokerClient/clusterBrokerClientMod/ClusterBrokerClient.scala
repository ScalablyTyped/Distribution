package typings.sccBrokerClient.clusterBrokerClientMod

import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.AnonChannelName
import typings.sccBrokerClient.AnonError
import typings.sccBrokerClient.clientPoolMod.PublishData
import typings.sccBrokerClient.clientPoolMod.PublishFailData
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
import typings.sccBrokerClient.sccBrokerClientStrings.updateBrokers
import typings.sccBrokerClient.sccBrokerClientStrings.updateWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerClient
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var broker: typings.scBroker.scbrokerMod.^ = js.native
  var clientPoolSize: Double = js.native
  var errors: AnonChannelName = js.native
  var isReady: Boolean = js.native
  var mapper: MappingEngine = js.native
  var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
  var sccBrokerClientPools: js.Array[typings.sccBrokerClient.clientPoolMod.^] = js.native
  var sccBrokerURIList: js.Array[String] = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_message(eventName: message, data: MessageData): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(event: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(event: subscribeFail, data: SubscribeFailData): Unit = js.native
  @JSName("emit")
  def emit_updateBrokers(eventName: updateBrokers, data: UpdateBrokersData): Unit = js.native
  @JSName("emit")
  def emit_updateWorkers(eventName: updateWorkers, data: UpdateWorkersData): Unit = js.native
  def getAllSubscriptions(): js.Array[String] = js.native
  def invokePublish(channelName: String, data: js.Any): Unit = js.native
  @JSName("listener")
  def listener_error(eventName: error): typings.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_message(eventName: message): typings.consumableStream.mod.^[MessageData] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typings.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(event: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(event: subscribeFail): typings.consumableStream.mod.^[SubscribeFailData] = js.native
  @JSName("listener")
  def listener_updateBrokers(eventName: updateBrokers): typings.consumableStream.mod.^[UpdateBrokersData] = js.native
  @JSName("listener")
  def listener_updateWorkers(eventName: updateWorkers): typings.consumableStream.mod.^[UpdateWorkersData] = js.native
  def mapChannelNameToBrokerURI(channelName: String): String = js.native
  def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
  def subscribe(channelName: String): Unit = js.native
  def unsubscribe(channelName: String): Unit = js.native
}

