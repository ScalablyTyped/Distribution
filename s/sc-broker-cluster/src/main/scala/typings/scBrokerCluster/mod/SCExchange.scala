package typings.scBrokerCluster.mod

import typings.async.mod.AsyncResultArrayCallback
import typings.fleximap.mod.KeyChain
import typings.scBrokerCluster.anon.Targets
import typings.scBrokerCluster.clientclusterMod.ClientCluster
import typings.scChannel.mod.SCChannel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-broker-cluster", "SCExchange")
@js.native
class SCExchange protected () extends AbstractDataClient {
  def this(privateClientCluster: ClientCluster, publicClientCluster: ClientCluster, ioClusterClient: Client) = this()
  
  def channel(channelName: String): SCChannel[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _
  ] = js.native
  
  def destroy(): Unit = js.native
  
  def destroyChannel(channelName: String): Unit = js.native
  
  def getMapper(): mapperFunction = js.native
  
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  
  def map(keyChain: KeyChain, method: String): Targets = js.native
  
  def publish(channelName: String, data: js.Any): Unit = js.native
  def publish(channelName: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def send(data: js.Any): Unit = js.native
  def send(data: js.Any, mapIndex: String): Unit = js.native
  def send(data: js.Any, mapIndex: String, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: js.Array[String]): Unit = js.native
  def send(data: js.Any, mapIndex: js.Array[String], callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: Double): Unit = js.native
  def send(data: js.Any, mapIndex: Double, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def send(data: js.Any, mapIndex: Null, callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  
  def setMapper(mapper: mapperFunction): Unit = js.native
  
  def subscribe(channelName: String): SCChannel[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _
  ] = js.native
  
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  
  def unsubscribe(channelName: String): Unit = js.native
  
  def unwatch(channelName: String): Unit = js.native
  def unwatch(channelName: String, handler: handlerFunction): Unit = js.native
  
  def watch(channelName: String, handler: handlerFunction): Unit = js.native
  
  def watchers(channelName: String): js.Array[handlerFunction] = js.native
}
