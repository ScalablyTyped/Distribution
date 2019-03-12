package typings
package sccDashBrokerDashClientLib.clusterDashBrokerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerClient
  extends nodeLib.eventsMod.EventEmitter {
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.native
  var broker: scDashBrokerLib.scbrokerMod.namespaced = js.native
  var clientPoolSize: scala.Double = js.native
  var mapper: sccDashBrokerDashClientLib.sccDashBrokerDashClientMod.MappingEngine = js.native
  var mappingEngine: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.skeletonRendezvous | sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.simple | sccDashBrokerDashClientLib.sccDashBrokerDashClientMod.MappingEngine = js.native
  var sccBrokerClientPools: js.Array[sccDashBrokerDashClientLib.clientDashPoolMod.namespaced] = js.native
  var sccBrokerURIList: js.Array[java.lang.String] = js.native
  def getAllSubscriptions(): js.Array[java.lang.String] = js.native
  def mapChannelNameToBrokerURI(channelName: java.lang.String): java.lang.String = js.native
  @JSName("on")
  def on_error(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.message,
    listener: js.Function2[/* channelName */ java.lang.String, /* packet */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_publish(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.publish,
    listener: js.Function1[
      /* data */ sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs.PublishData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_publishFail(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.publishFail,
    listener: js.Function1[
      /* data */ sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs.PublishData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.subscribe,
    listener: js.Function1[
      /* data */ sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs.SubscribeData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeFail(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.subscribeFail,
    listener: js.Function1[
      /* data */ sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs.SubscribeFailData, 
      scala.Unit
    ]
  ): this.type = js.native
  def publish(channelName: java.lang.String, data: js.Any): scala.Unit = js.native
  def setBrokers(sccBrokerURIList: js.Array[java.lang.String]): scala.Unit = js.native
  def subscribe(channelName: java.lang.String): scala.Unit = js.native
  def unsubscribe(channelName: java.lang.String): scala.Unit = js.native
}

