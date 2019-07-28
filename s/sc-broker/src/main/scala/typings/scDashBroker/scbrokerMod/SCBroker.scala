package typings.scDashBroker.scbrokerMod

import typings.expirymanager.expirymanagerMod.ExpiryManager
import typings.fleximap.fleximapMod.FlexiMap
import typings.fleximap.fleximapMod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scDashBroker.scDashBrokerStrings.broker
import typings.scDashBroker.scDashBrokerStrings.masterMessage
import typings.scDashBroker.scDashBrokerStrings.message
import typings.scDashBroker.scDashBrokerStrings.publish
import typings.scDashBroker.scDashBrokerStrings.publishIn
import typings.scDashBroker.scDashBrokerStrings.subscribe
import typings.scDashBroker.scDashBrokerStrings.unsubscribe
import typings.scDashBroker.scDashBrokerStrings.warning
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

