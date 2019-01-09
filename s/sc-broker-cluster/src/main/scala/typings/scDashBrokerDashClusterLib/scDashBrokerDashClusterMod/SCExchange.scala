package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "SCExchange")
@js.native
class SCExchange protected () extends AbstractDataClient {
  def this(privateClientCluster: scDashBrokerDashClusterLib.clientclusterMod.ClientCluster, publicClientCluster: scDashBrokerDashClusterLib.clientclusterMod.ClientCluster, ioClusterClient: Client) = this()
  def channel(channelName: java.lang.String): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def destroy(): scala.Unit = js.native
  def destroyChannel(channelName: java.lang.String): scala.Unit = js.native
  def getMapper(): mapperFunction = js.native
  def isSubscribed(channelName: java.lang.String): scala.Boolean = js.native
  def isSubscribed(channelName: java.lang.String, includePending: scala.Boolean): scala.Boolean = js.native
  def map(keyChain: fleximapLib.fleximapMod.KeyChain, method: java.lang.String): scDashBrokerDashClusterLib.Anon_Targets = js.native
  def publish(
    channelName: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def send(data: js.Any, mapIndex: java.lang.String): scala.Unit = js.native
  def send(
    data: js.Any,
    mapIndex: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def send(data: js.Any, mapIndex: js.Array[java.lang.String]): scala.Unit = js.native
  def send(
    data: js.Any,
    mapIndex: js.Array[java.lang.String],
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def send(data: js.Any, mapIndex: scala.Double): scala.Unit = js.native
  def send(
    data: js.Any,
    mapIndex: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def send(
    data: js.Any,
    mapIndex: scala.Null,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def setMapper(mapper: mapperFunction): scala.Unit = js.native
  def subscribe(channelName: java.lang.String): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def subscriptions(includePending: scala.Boolean): js.Array[java.lang.String] = js.native
  def unsubscribe(channelName: java.lang.String): scala.Unit = js.native
  def unwatch(channelName: java.lang.String): scala.Unit = js.native
  def unwatch(channelName: java.lang.String, handler: handlerFunction): scala.Unit = js.native
  def watch(channelName: java.lang.String, handler: handlerFunction): scala.Unit = js.native
  def watchers(channelName: java.lang.String): js.Array[handlerFunction] = js.native
}

