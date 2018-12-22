package typings
package sccDashBrokerDashClientLib.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPool
  extends nodeLib.eventsMod.EventEmitter {
  var areClientListenersBound: scala.Boolean = js.native
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.native
  var clientCount: scala.Double = js.native
  var clients: js.Array[socketclusterDashClientLib.libScclientsocketMod.namespaced] = js.native
  var hasher: sccDashBrokerDashClientLib.hasherMod.namespaced = js.native
  var targetURI: java.lang.String = js.native
  def bindClientListeners(): scala.Unit = js.native
  def breakDownURI(uri: java.lang.String): BrokenDownURI = js.native
  def destroy(): scala.Unit = js.native
  def destroyChannel(channelName: java.lang.String): scala.Unit = js.native
  @JSName("on")
  def on_error(
    event: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
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
  def selectClient(key: java.lang.String): socketclusterDashClientLib.libScclientsocketMod.namespaced = js.native
  def subscribeAndWatch(channelName: java.lang.String, handler: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def subscriptions(includePending: scala.Boolean): js.Array[java.lang.String] = js.native
  def unbindClientListeners(): scala.Unit = js.native
}

