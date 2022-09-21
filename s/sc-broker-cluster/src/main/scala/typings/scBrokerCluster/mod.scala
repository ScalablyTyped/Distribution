package typings.scBrokerCluster

import typings.async.mod.AsyncResultArrayCallback
import typings.expirymanager.mod.Keys
import typings.fleximap.mod.FlexiMap
import typings.fleximap.mod.KeyChain
import typings.node.eventsMod.EventEmitter
import typings.scBroker.mod.QueryOptions
import typings.scBroker.mod.SpliceOptions
import typings.scBrokerCluster.anon.Targets
import typings.scBrokerCluster.clientclusterMod.ClientCluster
import typings.scBrokerCluster.scBrokerClusterStrings.brokerExit
import typings.scBrokerCluster.scBrokerClusterStrings.brokerMessage
import typings.scBrokerCluster.scBrokerClusterStrings.brokerStart
import typings.scBrokerCluster.scBrokerClusterStrings.error
import typings.scBrokerCluster.scBrokerClusterStrings.message
import typings.scBrokerCluster.scBrokerClusterStrings.ready
import typings.scBrokerCluster.scBrokerClusterStrings.warning
import typings.scChannel.mod.SCChannel
import typings.socketclusterServer.serverMod.AGServerOptions
import typings.socketclusterServer.serverMod.CodecEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-broker-cluster", "AbstractDataClient")
  @js.native
  open class AbstractDataClient protected () extends EventEmitter {
    def this(dataClient: ClientCluster) = this()
    
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
    
    def count(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
    
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
    
    def pop(keyChain: KeyChain, callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]): Unit = js.native
    
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
    
    def splice(keyChain: KeyChain): Unit = js.native
    def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: SpliceOptions): Unit = js.native
    def splice(
      keyChain: KeyChain,
      options: SpliceOptions,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def unexpire(keys: Keys): Unit = js.native
    def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  @JSImport("sc-broker-cluster", "Client")
  @js.native
  open class Client protected () extends EventEmitter {
    def this(options: SCBrokerClusterClientOptions) = this()
    
    def destroy(): Unit = js.native
    def destroy(callback: AsyncResultArrayCallback[SCExchange, js.Error]): Unit = js.native
    
    def exchange(): SCExchange = js.native
    
    def isSubscribed(channel: String): Boolean = js.native
    def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* packet */ MessagePacket, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    var options: SCBrokerClusterClientOptions = js.native
    
    def setSCServer(scServer: SCServer): Unit = js.native
    
    def subscribe(channel: String): Unit = js.native
    def subscribe(channel: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def subscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
    def subscribeSocket(
      socket: ServerSocket,
      channel: String,
      callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def unsubscribe(channel: String): Unit = js.native
    def unsubscribe(channel: String, callback: js.Function0[Unit]): Unit = js.native
    
    def unsubscribeAll(): Unit = js.native
    def unsubscribeAll(callback: AsyncResultArrayCallback[Any, js.Error]): Unit = js.native
    
    def unsubscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
    def unsubscribeSocket(socket: ServerSocket, channel: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sc-broker-cluster", "SCExchange")
  @js.native
  open class SCExchange protected () extends AbstractDataClient {
    def this(privateClientCluster: ClientCluster, publicClientCluster: ClientCluster, ioClusterClient: Client) = this()
    
    def channel(channelName: String): SCChannel[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ] = js.native
    
    def destroy(): Unit = js.native
    
    def destroyChannel(channelName: String): Unit = js.native
    
    def getMapper(): mapperFunction = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
    
    def map(keyChain: KeyChain, method: String): Targets = js.native
    
    def publish(channelName: String, data: Any): Unit = js.native
    def publish(channelName: String, data: Any, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def send(data: Any): Unit = js.native
    def send(data: Any, mapIndex: String): Unit = js.native
    def send(data: Any, mapIndex: String, callback: AsyncResultArrayCallback[Any, js.Error]): Unit = js.native
    def send(data: Any, mapIndex: js.Array[String]): Unit = js.native
    def send(data: Any, mapIndex: js.Array[String], callback: AsyncResultArrayCallback[Any, js.Error]): Unit = js.native
    def send(data: Any, mapIndex: Double): Unit = js.native
    def send(data: Any, mapIndex: Double, callback: AsyncResultArrayCallback[Any, js.Error]): Unit = js.native
    def send(data: Any, mapIndex: Null, callback: AsyncResultArrayCallback[Any, js.Error]): Unit = js.native
    
    def setMapper(mapper: mapperFunction): Unit = js.native
    
    def subscribe(channelName: String): SCChannel[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
      ] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    def unsubscribe(channelName: String): Unit = js.native
    
    def unwatch(channelName: String): Unit = js.native
    def unwatch(channelName: String, handler: handlerFunction): Unit = js.native
    
    def watch(channelName: String, handler: handlerFunction): Unit = js.native
    
    def watchers(channelName: String): js.Array[handlerFunction] = js.native
  }
  
  @JSImport("sc-broker-cluster", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(options: SCBrokerClusterServerOptions) = this()
    
    def destroy(): Unit = js.native
    
    def killBrokers(): Unit = js.native
    
    @JSName("on")
    def on_brokerExit(event: brokerExit, listener: js.Function1[/* brokerInfo */ BrokerExitInfo, Unit]): this.type = js.native
    @JSName("on")
    def on_brokerMessage(event: brokerMessage, listener: BrokerMessageListener): this.type = js.native
    @JSName("on")
    def on_brokerStart(event: brokerStart, listener: js.Function1[/* brokerInfo */ BrokerStartInfo, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def sendToBroker(brokerId: String, data: Any): Unit = js.native
    def sendToBroker(
      brokerId: String,
      data: Any,
      callback: js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit]
    ): Unit = js.native
  }
  
  trait BrokerExitInfo extends StObject {
    
    var code: Double
    
    var id: Double
    
    var pid: Double
    
    var signal: String
  }
  object BrokerExitInfo {
    
    inline def apply(code: Double, id: Double, pid: Double, signal: String): BrokerExitInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerExitInfo]
    }
    
    extension [Self <: BrokerExitInfo](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type BrokerMessageListener = js.Function3[
    /* brokerId */ String, 
    /* data */ Any, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* data */ Any, Unit], 
    Unit
  ]
  
  trait BrokerStartInfo extends StObject {
    
    var id: Double
    
    var pid: Double
    
    var respawn: Boolean
  }
  object BrokerStartInfo {
    
    inline def apply(id: Double, pid: Double, respawn: Boolean): BrokerStartInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerStartInfo]
    }
    
    extension [Self <: BrokerStartInfo](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setRespawn(value: Boolean): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessagePacket extends StObject {
    
    var channel: String
    
    var data: Any
  }
  object MessagePacket {
    
    inline def apply(channel: String, data: Any): MessagePacket = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePacket]
    }
    
    extension [Self <: MessagePacket](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait SCBrokerClusterClientOptions extends StObject {
    
    var brokers: js.Array[String]
    
    var connectRetryErrorThreshold: Double
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
  }
  object SCBrokerClusterClientOptions {
    
    inline def apply(brokers: js.Array[String], connectRetryErrorThreshold: Double): SCBrokerClusterClientOptions = {
      val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], connectRetryErrorThreshold = connectRetryErrorThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCBrokerClusterClientOptions]
    }
    
    extension [Self <: SCBrokerClusterClientOptions](x: Self) {
      
      inline def setBrokers(value: js.Array[String]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
      
      inline def setBrokersVarargs(value: String*): Self = StObject.set(x, "brokers", js.Array(value*))
      
      inline def setConnectRetryErrorThreshold(value: Double): Self = StObject.set(x, "connectRetryErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      inline def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  trait SCBrokerClusterServerOptions extends StObject {
    
    var appBrokerControllerPath: js.UndefOr[String] = js.undefined
    
    var brokerOptions: js.UndefOr[AGServerOptions] = js.undefined
    
    var brokers: js.Array[String]
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var downgradeToUser: Double | String
    
    var expiryAccuracy: js.UndefOr[Double] = js.undefined
    
    var inspect: js.UndefOr[Boolean] = js.undefined
    
    var instanceId: js.UndefOr[String] = js.undefined
    
    var ipcAckTimeout: js.UndefOr[Double] = js.undefined
    
    var processTermTimeout: js.UndefOr[Double] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
  }
  object SCBrokerClusterServerOptions {
    
    inline def apply(brokers: js.Array[String], downgradeToUser: Double | String): SCBrokerClusterServerOptions = {
      val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCBrokerClusterServerOptions]
    }
    
    extension [Self <: SCBrokerClusterServerOptions](x: Self) {
      
      inline def setAppBrokerControllerPath(value: String): Self = StObject.set(x, "appBrokerControllerPath", value.asInstanceOf[js.Any])
      
      inline def setAppBrokerControllerPathUndefined: Self = StObject.set(x, "appBrokerControllerPath", js.undefined)
      
      inline def setBrokerOptions(value: AGServerOptions): Self = StObject.set(x, "brokerOptions", value.asInstanceOf[js.Any])
      
      inline def setBrokerOptionsUndefined: Self = StObject.set(x, "brokerOptions", js.undefined)
      
      inline def setBrokers(value: js.Array[String]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
      
      inline def setBrokersVarargs(value: String*): Self = StObject.set(x, "brokers", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDowngradeToUser(value: Double | String): Self = StObject.set(x, "downgradeToUser", value.asInstanceOf[js.Any])
      
      inline def setExpiryAccuracy(value: Double): Self = StObject.set(x, "expiryAccuracy", value.asInstanceOf[js.Any])
      
      inline def setExpiryAccuracyUndefined: Self = StObject.set(x, "expiryAccuracy", js.undefined)
      
      inline def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setIpcAckTimeout(value: Double): Self = StObject.set(x, "ipcAckTimeout", value.asInstanceOf[js.Any])
      
      inline def setIpcAckTimeoutUndefined: Self = StObject.set(x, "ipcAckTimeout", js.undefined)
      
      inline def setProcessTermTimeout(value: Double): Self = StObject.set(x, "processTermTimeout", value.asInstanceOf[js.Any])
      
      inline def setProcessTermTimeoutUndefined: Self = StObject.set(x, "processTermTimeout", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  trait SCServer extends StObject {
    
    var codec: CodecEngine
  }
  object SCServer {
    
    inline def apply(codec: CodecEngine): SCServer = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCServer]
    }
    
    extension [Self <: SCServer](x: Self) {
      
      inline def setCodec(value: CodecEngine): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerSocket extends StObject {
    
    def emit(eventName: String, args: Any*): Unit
    
    var id: String
  }
  object ServerSocket {
    
    inline def apply(emit: (String, /* repeated */ Any) => Unit, id: String): ServerSocket = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSocket]
    }
    
    extension [Self <: ServerSocket](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type handlerFunction = js.Function1[/* data */ Any, Unit]
  
  type mapperFunction = js.Function3[
    /* keyChain */ KeyChain, 
    /* method */ String, 
    /* clientIds */ js.Array[Double], 
    Double | js.Array[Double]
  ]
}
