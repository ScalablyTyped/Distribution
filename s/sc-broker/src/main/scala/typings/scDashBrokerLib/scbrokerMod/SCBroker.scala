package typings
package scDashBrokerLib.scbrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBroker
  extends nodeLib.eventsMod.EventEmitter {
  val MIDDLEWARE_PUBLISH_IN: scDashBrokerLib.scDashBrokerLibStrings.publishIn = js.native
  val MIDDLEWARE_SUBSCRIBE: scDashBrokerLib.scDashBrokerLibStrings.subscribe = js.native
  var dataExpirer: expirymanagerLib.expirymanagerMod.ExpiryManager = js.native
  var dataMap: fleximapLib.fleximapMod.FlexiMap = js.native
  var debugPort: scala.Double = js.native
  var id: scala.Double = js.native
  var instanceId: scala.Double = js.native
  var options: scDashBrokerLib.scbrokerMod.SCBrokerNs.SCBrokerOptions = js.native
  var subscriptions: Subscriptions = js.native
  val `type`: scDashBrokerLib.scDashBrokerLibStrings.broker = js.native
  def exec(
    query: js.Function3[
      /* dataMap */ fleximapLib.fleximapMod.FlexiMap, 
      /* dataExpirer */ expirymanagerLib.expirymanagerMod.ExpiryManager, 
      /* subscriptions */ Subscriptions, 
      _
    ]
  ): js.Any = js.native
  def exec(
    query: js.Function3[
      /* dataMap */ fleximapLib.fleximapMod.FlexiMap, 
      /* dataExpirer */ expirymanagerLib.expirymanagerMod.ExpiryManager, 
      /* subscriptions */ Subscriptions, 
      _
    ],
    baseKey: fleximapLib.fleximapMod.KeyChain
  ): js.Any = js.native
  @JSName("on")
  def on_masterMessage(
    event: scDashBrokerLib.scDashBrokerLibStrings.masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* responseData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: scDashBrokerLib.scDashBrokerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* respond */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* responseData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_publish(
    event: scDashBrokerLib.scDashBrokerLibStrings.publish,
    listener: js.Function2[/* channel */ java.lang.String, /* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: scDashBrokerLib.scDashBrokerLibStrings.subscribe,
    listener: js.Function1[/* channel */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unsubscribe(
    event: scDashBrokerLib.scDashBrokerLibStrings.unsubscribe,
    listener: js.Function1[/* channel */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_warning(
    event: scDashBrokerLib.scDashBrokerLibStrings.warning,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def publish(channel: java.lang.String, message: js.Any): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def sendToMaster(data: js.Any): scala.Unit = js.native
  def sendToMaster(
    data: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* responseData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

