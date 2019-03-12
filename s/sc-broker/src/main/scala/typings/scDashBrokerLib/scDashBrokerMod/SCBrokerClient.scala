package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerClient
  extends nodeLib.eventsMod.EventEmitter {
  val CONNECTED: scDashBrokerLib.scDashBrokerLibStrings.connected = js.native
  val CONNECTING: scDashBrokerLib.scDashBrokerLibStrings.connecting = js.native
  val DISCONNECTED: scDashBrokerLib.scDashBrokerLibStrings.disconnected = js.native
  var autoReconnect: scala.Boolean = js.native
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  var connectAttempts: scala.Double = js.native
  var connectRetryErrorThreshold: scala.Double = js.native
  var host: js.UndefOr[java.lang.String] = js.native
  var pendingReconnect: scala.Boolean = js.native
  var pendingReconnectTimeout: scala.Double | scala.Null = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var socketPath: js.UndefOr[java.lang.String] = js.native
  var state: scDashBrokerLib.scDashBrokerLibStrings.connected | scDashBrokerLib.scDashBrokerLibStrings.connecting | scDashBrokerLib.scDashBrokerLibStrings.disconnected = js.native
  def add(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any): scala.Unit = js.native
  def add(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def add(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any, getValue: scala.Boolean): scala.Unit = js.native
  def add(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def concat(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any): scala.Unit = js.native
  def concat(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def concat(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any, getValue: scala.Boolean): scala.Unit = js.native
  def concat(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def count(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def end(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def exec(query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit]): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    options: QueryOptions
  ): scala.Unit = js.native
  def exec(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    options: QueryOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def expire(keys: expirymanagerLib.expirymanagerMod.Keys, seconds: scala.Double): scala.Unit = js.native
  def expire(
    keys: expirymanagerLib.expirymanagerMod.Keys,
    seconds: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def extractKeys(keyChain: fleximapLib.fleximapMod.KeyChain): js.Array[java.lang.String] = js.native
  def extractValues(keyChain: fleximapLib.fleximapMod.KeyChain): js.Array[_] = js.native
  def get(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getAll(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Array[_] | js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getExpiry(key: expirymanagerLib.expirymanagerMod.Key): scala.Double = js.native
  def getExpiry(
    key: expirymanagerLib.expirymanagerMod.Key,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Double = js.native
  def getRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def hasKey(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isConnected(): scala.Boolean = js.native
  def isSubscribed(channel: java.lang.String): scala.Boolean = js.native
  def isSubscribed(channel: java.lang.String, includePending: scala.Boolean): scala.Boolean = js.native
  @JSName("on")
  def on_error(
    event: scDashBrokerLib.scDashBrokerLibStrings.error,
    listener: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: scDashBrokerLib.scDashBrokerLibStrings.message,
    listener: js.Function2[/* channel */ java.lang.String, /* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: scDashBrokerLib.scDashBrokerLibStrings.ready,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: scDashBrokerLib.scDashBrokerLibStrings.subscribe,
    listener: js.Function1[/* channel */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeFail(
    event: scDashBrokerLib.scDashBrokerLibStrings.subscribeFail,
    listener: js.Function2[/* err */ stdLib.Error | scala.Null, /* channel */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: scDashBrokerLib.scDashBrokerLibStrings.unsubscribe, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_warning(
    event: scDashBrokerLib.scDashBrokerLibStrings.warning,
    listener: js.Function1[/* warning */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  def pop(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def publish(
    channel: java.lang.String,
    data: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def query(query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit]): scala.Unit = js.native
  def query(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def query(query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit], data: js.Any): scala.Unit = js.native
  def query(
    query: js.Function1[/* datamap */ fleximapLib.fleximapMod.FlexiMap, scala.Unit],
    data: js.Any,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def remove(keyChain: fleximapLib.fleximapMod.KeyChain): scala.Unit = js.native
  def remove(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def remove(keyChain: fleximapLib.fleximapMod.KeyChain, getValue: scala.Boolean): scala.Unit = js.native
  def remove(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def removeRange(keyChain: fleximapLib.fleximapMod.KeyChain, fromIndex: scala.Double): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeRange(keyChain: fleximapLib.fleximapMod.KeyChain, fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    getValue: scala.Boolean
  ): scala.Unit = js.native
  def removeRange(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    fromIndex: scala.Double,
    toIndex: scala.Double,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def send(data: js.Any, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def set(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any): scala.Unit = js.native
  def set(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def set(keyChain: fleximapLib.fleximapMod.KeyChain, value: js.Any, getValue: scala.Boolean): scala.Unit = js.native
  def set(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    value: js.Any,
    getValue: scala.Boolean,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def splice(keyChain: fleximapLib.fleximapMod.KeyChain): scala.Unit = js.native
  def splice(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def splice(keyChain: fleximapLib.fleximapMod.KeyChain, options: SpliceOptions): scala.Unit = js.native
  def splice(
    keyChain: fleximapLib.fleximapMod.KeyChain,
    options: SpliceOptions,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def subscribe(
    channel: java.lang.String,
    ackCallback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def subscribe(
    channel: java.lang.String,
    ackCallback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit],
    force: scala.Boolean
  ): scala.Unit = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def subscriptions(includePending: scala.Boolean): js.Array[java.lang.String] = js.native
  def unexpire(keys: expirymanagerLib.expirymanagerMod.Keys): scala.Unit = js.native
  def unexpire(
    keys: expirymanagerLib.expirymanagerMod.Keys,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def unsubscribe(
    channel: java.lang.String,
    ackCallback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

