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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-broker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(): SCBrokerClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[SCBrokerClient]
  inline def createClient(options: SCBrokerClientOptions): SCBrokerClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[SCBrokerClient]
  
  inline def createServer(): SCBrokerServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[SCBrokerServer]
  inline def createServer(options: SCBrokerServerOptions): SCBrokerServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[SCBrokerServer]
  
  trait AutoReconnectOptions extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var multiplier: js.UndefOr[Double] = js.undefined
    
    var randomness: js.UndefOr[Double] = js.undefined
  }
  object AutoReconnectOptions {
    
    inline def apply(): AutoReconnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoReconnectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoReconnectOptions] (val x: Self) extends AnyVal {
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      inline def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
      
      inline def setRandomness(value: Double): Self = StObject.set(x, "randomness", value.asInstanceOf[js.Any])
      
      inline def setRandomnessUndefined: Self = StObject.set(x, "randomness", js.undefined)
    }
  }
  
  type BrokerMessageListener = js.Function3[
    /* brokerId */ String, 
    /* data */ Any, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit], 
    Unit
  ]
  
  trait ExitData extends StObject {
    
    var code: Double
    
    var id: String
    
    var pid: Double
    
    var signal: String
  }
  object ExitData {
    
    inline def apply(code: Double, id: String, pid: Double, signal: String): ExitData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExitData] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryOptions extends StObject {
    
    var baseKey: js.UndefOr[KeyChain] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var noAck: js.UndefOr[Boolean] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseKey(value: KeyChain): Self = StObject.set(x, "baseKey", value.asInstanceOf[js.Any])
      
      inline def setBaseKeyUndefined: Self = StObject.set(x, "baseKey", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      inline def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
    }
  }
  
  @js.native
  trait SCBrokerClient extends EventEmitter {
    
    val CONNECTED: connected = js.native
    
    val CONNECTING: connecting = js.native
    
    val DISCONNECTED: disconnected = js.native
    
    def add(keyChain: KeyChain, value: Any): Unit = js.native
    def add(keyChain: KeyChain, value: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def add(keyChain: KeyChain, value: Any, getValue: Boolean): Unit = js.native
    def add(
      keyChain: KeyChain,
      value: Any,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def add(
      keyChain: KeyChain,
      value: Any,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    var autoReconnect: Boolean = js.native
    
    var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
    
    def concat(keyChain: KeyChain, value: Any): Unit = js.native
    def concat(keyChain: KeyChain, value: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def concat(keyChain: KeyChain, value: Any, getValue: Boolean): Unit = js.native
    def concat(
      keyChain: KeyChain,
      value: Any,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def concat(
      keyChain: KeyChain,
      value: Any,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    var connectAttempts: Double = js.native
    
    var connectRetryErrorThreshold: Double = js.native
    
    def count(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    def end(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def exec(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
    def exec(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    def exec(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      options: Unit,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    def exec(query: js.Function1[/* datamap */ FlexiMap, Unit], options: QueryOptions): Unit = js.native
    def exec(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      options: QueryOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    
    def expire(keys: Keys, seconds: Double): Unit = js.native
    def expire(keys: Keys, seconds: Double, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def extractKeys(keyChain: KeyChain): js.Array[String] = js.native
    
    def extractValues(keyChain: KeyChain): js.Array[Any] = js.native
    
    def get(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]): Unit = js.native
    
    def getAll(callback: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[Any] | js.Object, Unit]): Unit = js.native
    
    def getExpiry(key: Key): Double = js.native
    def getExpiry(key: Key, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Double = js.native
    
    def getRange(
      keyChain: KeyChain,
      fromIndex: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]
    ): Unit = js.native
    def getRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit]
    ): Unit = js.native
    
    def hasKey(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* data */ Boolean, Unit]): Unit = js.native
    
    var host: js.UndefOr[String] = js.native
    
    def isConnected(): Boolean = js.native
    
    def isSubscribed(channel: String): Boolean = js.native
    def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* channel */ String, /* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribe(event: subscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribeFail(
      event: subscribeFail,
      listener: js.Function2[/* err */ js.Error | Null, /* channel */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_unsubscribe(event: unsubscribe, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    var pendingReconnect: Boolean = js.native
    
    var pendingReconnectTimeout: Double | Null = js.native
    
    def pop(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]): Unit = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    def publish(channel: String, data: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def query(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
    def query(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    def query(query: js.Function1[/* datamap */ FlexiMap, Unit], data: Any): Unit = js.native
    def query(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      data: Any,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    def query(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      data: Unit,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
    
    def remove(keyChain: KeyChain): Unit = js.native
    def remove(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def remove(keyChain: KeyChain, getValue: Boolean): Unit = js.native
    def remove(
      keyChain: KeyChain,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def remove(keyChain: KeyChain, getValue: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def removeAll(): Unit = js.native
    def removeAll(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def removeRange(keyChain: KeyChain, fromIndex: Double): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double, getValue: Boolean): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Unit, getValue: Boolean): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def send(data: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def set(keyChain: KeyChain, value: Any): Unit = js.native
    def set(keyChain: KeyChain, value: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def set(keyChain: KeyChain, value: Any, getValue: Boolean): Unit = js.native
    def set(
      keyChain: KeyChain,
      value: Any,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def set(
      keyChain: KeyChain,
      value: Any,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    def splice(keyChain: KeyChain): Unit = js.native
    def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: SpliceOptions): Unit = js.native
    def splice(
      keyChain: KeyChain,
      options: SpliceOptions,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    var state: connected | connecting | disconnected = js.native
    
    def subscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def subscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[js.Error], Unit], force: Boolean): Unit = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    def unexpire(keys: Keys): Unit = js.native
    def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def unsubscribe(channel: String, ackCallback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  trait SCBrokerClientOptions extends StObject {
    
    var autoReconnect: js.UndefOr[Boolean] = js.undefined
    
    var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.undefined
    
    var connectRetryErrorThreshold: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SCBrokerClientOptions {
    
    inline def apply(): SCBrokerClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SCBrokerClientOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
      
      inline def setAutoReconnectOptions(value: AutoReconnectOptions): Self = StObject.set(x, "autoReconnectOptions", value.asInstanceOf[js.Any])
      
      inline def setAutoReconnectOptionsUndefined: Self = StObject.set(x, "autoReconnectOptions", js.undefined)
      
      inline def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
      
      inline def setConnectRetryErrorThreshold(value: Double): Self = StObject.set(x, "connectRetryErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setConnectRetryErrorThresholdUndefined: Self = StObject.set(x, "connectRetryErrorThreshold", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      inline def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait SCBrokerServer extends EventEmitter {
    
    def destroy(): Unit = js.native
    
    var ipcAckTimeout: Double = js.native
    
    @JSName("off")
    def off_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("off")
    def off_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("off")
    def off_ready(event: ready, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    
    @JSName("on")
    def on_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    
    @JSName("once")
    def once_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    
    var options: SCBrokerServerOptions = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    @JSName("removeListener")
    def removeListener_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_exit(event: exit, listener: js.Function1[/* data */ ExitData, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function1[/* data */ Any, Unit]): this.type = js.native
    
    def sendToBroker(data: Any): Unit = js.native
    def sendToBroker(
      data: Any,
      callback: js.Function3[/* err */ js.Error | Null, /* data */ Any, /* brokerId */ String, Unit]
    ): Unit = js.native
    
    var socketPath: js.UndefOr[String] = js.native
  }
  
  trait SCBrokerServerOptions extends StObject {
    
    var brokerControllerPath: js.UndefOr[String] = js.undefined
    
    var brokerOptions: js.UndefOr[SCBrokerOptions] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var downgradeToUser: js.UndefOr[Double | String] = js.undefined
    
    var expiryAccuracy: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inspect: js.UndefOr[Boolean] = js.undefined
    
    var instanceId: js.UndefOr[String] = js.undefined
    
    var ipcAckTimeout: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var processTermTimeout: js.UndefOr[Double] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
  }
  object SCBrokerServerOptions {
    
    inline def apply(): SCBrokerServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SCBrokerServerOptions] (val x: Self) extends AnyVal {
      
      inline def setBrokerControllerPath(value: String): Self = StObject.set(x, "brokerControllerPath", value.asInstanceOf[js.Any])
      
      inline def setBrokerControllerPathUndefined: Self = StObject.set(x, "brokerControllerPath", js.undefined)
      
      inline def setBrokerOptions(value: SCBrokerOptions): Self = StObject.set(x, "brokerOptions", value.asInstanceOf[js.Any])
      
      inline def setBrokerOptionsUndefined: Self = StObject.set(x, "brokerOptions", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDowngradeToUser(value: Double | String): Self = StObject.set(x, "downgradeToUser", value.asInstanceOf[js.Any])
      
      inline def setDowngradeToUserUndefined: Self = StObject.set(x, "downgradeToUser", js.undefined)
      
      inline def setExpiryAccuracy(value: Double): Self = StObject.set(x, "expiryAccuracy", value.asInstanceOf[js.Any])
      
      inline def setExpiryAccuracyUndefined: Self = StObject.set(x, "expiryAccuracy", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setIpcAckTimeout(value: Double): Self = StObject.set(x, "ipcAckTimeout", value.asInstanceOf[js.Any])
      
      inline def setIpcAckTimeoutUndefined: Self = StObject.set(x, "ipcAckTimeout", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProcessTermTimeout(value: Double): Self = StObject.set(x, "processTermTimeout", value.asInstanceOf[js.Any])
      
      inline def setProcessTermTimeoutUndefined: Self = StObject.set(x, "processTermTimeout", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    }
  }
  
  trait SpliceOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var getValue: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var noAck: js.UndefOr[Boolean] = js.undefined
  }
  object SpliceOptions {
    
    inline def apply(): SpliceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpliceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpliceOptions] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setGetValue(value: Boolean): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNoAck(value: Boolean): Self = StObject.set(x, "noAck", value.asInstanceOf[js.Any])
      
      inline def setNoAckUndefined: Self = StObject.set(x, "noAck", js.undefined)
    }
  }
}
