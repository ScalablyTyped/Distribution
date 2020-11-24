package typings.sccBrokerClient.mod

import typings.agSimpleBroker.mod.PublishData
import typings.agSimpleBroker.mod.SubscribeData
import typings.agSimpleBroker.mod.UnsubscribeData
import typings.consumableStream.mod.^
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broker extends js.Object {
  
  def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
  
  @JSName("listener")
  def listener_publish(eventName: publish): ^[PublishData] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): ^[SubscribeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): ^[UnsubscribeData] = js.native
  
  def subscriptions(): js.Array[String] = js.native
}
