package typings.scBroker.scbrokerMod

import typings.expirymanager.mod.ExpiryManager
import typings.fleximap.mod.FlexiMap
import typings.fleximap.mod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scBroker.scBrokerStrings.broker
import typings.scBroker.scBrokerStrings.masterMessage
import typings.scBroker.scBrokerStrings.message
import typings.scBroker.scBrokerStrings.publish
import typings.scBroker.scBrokerStrings.publishIn
import typings.scBroker.scBrokerStrings.subscribe
import typings.scBroker.scBrokerStrings.unsubscribe
import typings.scBroker.scBrokerStrings.warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBroker extends EventEmitter {
  val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
  val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
  var dataExpirer: ExpiryManager = js.native
  var dataMap: FlexiMap = js.native
  var debugPort: Double = js.native
  var id: Double = js.native
  var instanceId: Double = js.native
  var options: SCBrokerOptions = js.native
  var subscriptions: Subscriptions = js.native
  val `type`: broker = js.native
  def exec(
    query: js.Function3[
      /* dataMap */ FlexiMap, 
      /* dataExpirer */ ExpiryManager, 
      /* subscriptions */ Subscriptions, 
      _
    ]
  ): js.Any = js.native
  def exec(
    query: js.Function3[
      /* dataMap */ FlexiMap, 
      /* dataExpirer */ ExpiryManager, 
      /* subscriptions */ Subscriptions, 
      _
    ],
    baseKey: KeyChain
  ): js.Any = js.native
  @JSName("on")
  def on_masterMessage(
    event: masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* respond */ js.Function2[/* err */ Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_publish(event: publish, listener: js.Function2[/* channel */ String, /* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: unsubscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  def publish(channel: String, message: js.Any): Unit = js.native
  def run(): Unit = js.native
  def sendToMaster(data: js.Any): Unit = js.native
  def sendToMaster(data: js.Any, callback: js.Function2[/* err */ Error | Null, /* responseData */ js.Any, Unit]): Unit = js.native
}

