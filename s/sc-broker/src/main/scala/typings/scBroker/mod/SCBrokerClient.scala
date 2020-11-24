package typings.scBroker.mod

import typings.expirymanager.mod.Key
import typings.expirymanager.mod.Keys
import typings.fleximap.mod.FlexiMap
import typings.fleximap.mod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scBroker.scBrokerStrings.connected
import typings.scBroker.scBrokerStrings.connecting
import typings.scBroker.scBrokerStrings.disconnected
import typings.scBroker.scBrokerStrings.error
import typings.scBroker.scBrokerStrings.message
import typings.scBroker.scBrokerStrings.ready
import typings.scBroker.scBrokerStrings.subscribe
import typings.scBroker.scBrokerStrings.subscribeFail
import typings.scBroker.scBrokerStrings.unsubscribe
import typings.scBroker.scBrokerStrings.warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCBrokerClient extends EventEmitter {
  
  val CONNECTED: connected = js.native
  
  val CONNECTING: connecting = js.native
  
  val DISCONNECTED: disconnected = js.native
  
  def add(keyChain: KeyChain, value: js.Any): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def add(
    keyChain: KeyChain,
    value: js.Any,
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def add(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def add(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  var autoReconnect: Boolean = js.native
  
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  
  def concat(keyChain: KeyChain, value: js.Any): Unit = js.native
  def concat(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def concat(
    keyChain: KeyChain,
    value: js.Any,
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def concat(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def concat(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  var connectAttempts: Double = js.native
  
  var connectRetryErrorThreshold: Double = js.native
  
  def count(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
  
  def end(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def exec(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def exec(query: js.Function1[/* datamap */ FlexiMap, Unit], options: QueryOptions): Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    options: QueryOptions,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  
  def expire(keys: Keys, seconds: Double): Unit = js.native
  def expire(keys: Keys, seconds: Double, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def extractKeys(keyChain: KeyChain): js.Array[String] = js.native
  
  def extractValues(keyChain: KeyChain): js.Array[_] = js.native
  
  def get(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]): Unit = js.native
  
  def getAll(callback: js.Function2[/* err */ Error | Null, /* value */ js.Array[_] | js.Object, Unit]): Unit = js.native
  
  def getExpiry(key: Key): Double = js.native
  def getExpiry(key: Key, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Double = js.native
  
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  def getRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]
  ): Unit = js.native
  
  def hasKey(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* data */ Boolean, Unit]): Unit = js.native
  
  var host: js.UndefOr[String] = js.native
  
  def isConnected(): Boolean = js.native
  
  def isSubscribed(channel: String): Boolean = js.native
  def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* channel */ String, /* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribeFail(event: subscribeFail, listener: js.Function2[/* err */ Error | Null, /* channel */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: unsubscribe, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[Error], Unit]): this.type = js.native
  
  var pendingReconnect: Boolean = js.native
  
  var pendingReconnectTimeout: Double | Null = js.native
  
  def pop(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]): Unit = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  def publish(channel: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def query(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
  def query(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def query(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    data: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  def query(query: js.Function1[/* datamap */ FlexiMap, Unit], data: js.Any): Unit = js.native
  def query(
    query: js.Function1[/* datamap */ FlexiMap, Unit],
    data: js.Any,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  
  def remove(keyChain: KeyChain): Unit = js.native
  def remove(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def remove(
    keyChain: KeyChain,
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def remove(keyChain: KeyChain, getValue: Boolean): Unit = js.native
  def remove(keyChain: KeyChain, getValue: Boolean, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  def removeRange(keyChain: KeyChain, fromIndex: Double): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: js.UndefOr[scala.Nothing],
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: js.UndefOr[scala.Nothing], getValue: Boolean): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: js.UndefOr[scala.Nothing],
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double, getValue: Boolean): Unit = js.native
  def removeRange(
    keyChain: KeyChain,
    fromIndex: Double,
    toIndex: Double,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  def send(data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def set(keyChain: KeyChain, value: js.Any): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def set(
    keyChain: KeyChain,
    value: js.Any,
    getValue: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def set(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
  def set(
    keyChain: KeyChain,
    value: js.Any,
    getValue: Boolean,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  def splice(keyChain: KeyChain): Unit = js.native
  def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def splice(
    keyChain: KeyChain,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def splice(keyChain: KeyChain, options: SpliceOptions): Unit = js.native
  def splice(
    keyChain: KeyChain,
    options: SpliceOptions,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  var state: connected | connecting | disconnected = js.native
  
  def subscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def subscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[Error], Unit], force: Boolean): Unit = js.native
  
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  
  def unexpire(keys: Keys): Unit = js.native
  def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def unsubscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}
