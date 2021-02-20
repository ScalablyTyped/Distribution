package typings.scBroker

import typings.expirymanager.mod.Key
import typings.expirymanager.mod.Keys
import typings.fleximap.mod.FlexiMap
import typings.fleximap.mod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scBroker.scBrokerStrings.brokerMessage
import typings.scBroker.scBrokerStrings.connected
import typings.scBroker.scBrokerStrings.connecting
import typings.scBroker.scBrokerStrings.disconnected
import typings.scBroker.scBrokerStrings.error
import typings.scBroker.scBrokerStrings.exit
import typings.scBroker.scBrokerStrings.message
import typings.scBroker.scBrokerStrings.ready
import typings.scBroker.scBrokerStrings.subscribe
import typings.scBroker.scBrokerStrings.subscribeFail
import typings.scBroker.scBrokerStrings.unsubscribe
import typings.scBroker.scBrokerStrings.warning
import typings.scBroker.scbrokerMod.SCBrokerOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-broker", "createClient")
  @js.native
  def createClient(): SCBrokerClient = js.native
  @JSImport("sc-broker", "createClient")
  @js.native
  def createClient(options: SCBrokerClientOptions): SCBrokerClient = js.native
  
  @JSImport("sc-broker", "createServer")
  @js.native
  def createServer(): SCBrokerServer = js.native
  @JSImport("sc-broker", "createServer")
  @js.native
  def createServer(options: SCBrokerServerOptions): SCBrokerServer = js.native
  
  @js.native
  trait AutoReconnectOptions extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.native
    
    var maxDelay: js.UndefOr[Double] = js.native
    
    var multiplier: js.UndefOr[Double] = js.native
    
    var randomness: js.UndefOr[Double] = js.native
  }
  object AutoReconnectOptions {
    
    @scala.inline
    def apply(): AutoReconnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoReconnectOptions]
    }
    
    @scala.inline
    implicit class AutoReconnectOptionsMutableBuilder[Self <: AutoReconnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      @scala.inline
      def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
      
      @scala.inline
      def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    }
  }
  
  type BrokerMessageListener = js.Function3[
    /* brokerId */ String, 
    /* data */ js.Any, 
    /* callback */ js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit], 
    Unit
  ]
  
  @js.native
  trait ExitData extends StObject {
    
    var code: Double = js.native
    
    var id: String = js.native
    
    var pid: Double = js.native
    
    var signal: String = js.native
  }
  object ExitData {
    
    @scala.inline
    def apply(code: Double, id: String, pid: Double, signal: String): ExitData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitData]
    }
    
    @scala.inline
    implicit class ExitDataMutableBuilder[Self <: ExitData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryOptions extends StObject {
    
    var baseKey: js.UndefOr[KeyChain] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var noAck: js.UndefOr[Boolean] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseKey(value: KeyChain): Self = StObject.set(x, "baseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseKeyUndefined: Self = StObject.set(x, "baseKey", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
    }
  }
  
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
  
  @js.native
  trait SCBrokerClientOptions extends StObject {
    
    var autoReconnect: js.UndefOr[Boolean] = js.native
    
    var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
    
    var connectRetryErrorThreshold: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.native
    
    var secretKey: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object SCBrokerClientOptions {
    
    @scala.inline
    def apply(): SCBrokerClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerClientOptions]
    }
    
    @scala.inline
    implicit class SCBrokerClientOptionsMutableBuilder[Self <: SCBrokerClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReconnectOptions(value: AutoReconnectOptions): Self = StObject.set(x, "autoReconnectOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReconnectOptionsUndefined: Self = StObject.set(x, "autoReconnectOptions", js.undefined)
      
      @scala.inline
      def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
      
      @scala.inline
      def setConnectRetryErrorThreshold(value: Double): Self = StObject.set(x, "connectRetryErrorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectRetryErrorThresholdUndefined: Self = StObject.set(x, "connectRetryErrorThreshold", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait SCBrokerServer extends EventEmitter {
    
    def destroy(): Unit = js.native
    
    var ipcAckTimeout: Double = js.native
    
    @JSName("off")
    def off_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("off")
    def off_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("off")
    def off_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    
    @JSName("on")
    def on_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    
    @JSName("once")
    def once_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    
    var options: SCBrokerServerOptions = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    @JSName("removeListener")
    def removeListener_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    
    def sendToBroker(data: js.Any): Unit = js.native
    def sendToBroker(
      data: js.Any,
      callback: js.Function3[/* err */ Error | Null, /* data */ js.Any, /* brokerId */ String, Unit]
    ): Unit = js.native
    
    var socketPath: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait SCBrokerServerOptions extends StObject {
    
    var brokerControllerPath: js.UndefOr[String] = js.native
    
    var brokerOptions: js.UndefOr[SCBrokerOptions] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var downgradeToUser: js.UndefOr[Double | String] = js.native
    
    var expiryAccuracy: js.UndefOr[Double] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inspect: js.UndefOr[Boolean] = js.native
    
    var instanceId: js.UndefOr[String] = js.native
    
    var ipcAckTimeout: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var processTermTimeout: js.UndefOr[Double] = js.native
    
    var secretKey: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
  }
  object SCBrokerServerOptions {
    
    @scala.inline
    def apply(): SCBrokerServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerServerOptions]
    }
    
    @scala.inline
    implicit class SCBrokerServerOptionsMutableBuilder[Self <: SCBrokerServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrokerControllerPath(value: String): Self = StObject.set(x, "brokerControllerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerControllerPathUndefined: Self = StObject.set(x, "brokerControllerPath", js.undefined)
      
      @scala.inline
      def setBrokerOptions(value: SCBrokerOptions): Self = StObject.set(x, "brokerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerOptionsUndefined: Self = StObject.set(x, "brokerOptions", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDowngradeToUser(value: Double | String): Self = StObject.set(x, "downgradeToUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDowngradeToUserUndefined: Self = StObject.set(x, "downgradeToUser", js.undefined)
      
      @scala.inline
      def setExpiryAccuracy(value: Double): Self = StObject.set(x, "expiryAccuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryAccuracyUndefined: Self = StObject.set(x, "expiryAccuracy", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIpcAckTimeout(value: Double): Self = StObject.set(x, "ipcAckTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcAckTimeoutUndefined: Self = StObject.set(x, "ipcAckTimeout", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProcessTermTimeout(value: Double): Self = StObject.set(x, "processTermTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessTermTimeoutUndefined: Self = StObject.set(x, "processTermTimeout", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  @js.native
  trait SpliceOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var getValue: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var items: js.UndefOr[js.Array[_]] = js.native
    
    var noAck: js.UndefOr[Boolean] = js.native
  }
  object SpliceOptions {
    
    @scala.inline
    def apply(): SpliceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpliceOptions]
    }
    
    @scala.inline
    implicit class SpliceOptionsMutableBuilder[Self <: SpliceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setGetValue(value: Boolean): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
    }
  }
}
