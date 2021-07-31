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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-broker-cluster", "AbstractDataClient")
  @js.native
  class AbstractDataClient protected () extends EventEmitter {
    def this(dataClient: ClientCluster) = this()
    
    def add(keyChain: KeyChain, value: js.Any): Unit = js.native
    def add(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def add(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
    def add(
      keyChain: KeyChain,
      value: js.Any,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def add(
      keyChain: KeyChain,
      value: js.Any,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    
    def count(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = js.native
    
    def exec(query: js.Function1[/* datamap */ FlexiMap, Unit]): Unit = js.native
    def exec(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
    ): Unit = js.native
    def exec(
      query: js.Function1[/* datamap */ FlexiMap, Unit],
      options: Unit,
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
    
    def extractValues(keyChain: KeyChain): js.Array[js.Any] = js.native
    
    def get(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit]): Unit = js.native
    
    def getAll(callback: js.Function2[/* err */ Error | Null, /* value */ js.Array[js.Any] | js.Object, Unit]): Unit = js.native
    
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
    
    def pop(keyChain: KeyChain, callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]): Unit = js.native
    
    def remove(keyChain: KeyChain): Unit = js.native
    def remove(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def remove(keyChain: KeyChain, getValue: Boolean): Unit = js.native
    def remove(keyChain: KeyChain, getValue: Boolean, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def remove(keyChain: KeyChain, getValue: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def removeAll(): Unit = js.native
    def removeAll(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def removeRange(keyChain: KeyChain, fromIndex: Double): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Double): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
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
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Double,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def removeRange(keyChain: KeyChain, fromIndex: Double, toIndex: Unit, getValue: Boolean): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def removeRange(
      keyChain: KeyChain,
      fromIndex: Double,
      toIndex: Unit,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    
    def set(keyChain: KeyChain, value: js.Any): Unit = js.native
    def set(keyChain: KeyChain, value: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def set(keyChain: KeyChain, value: js.Any, getValue: Boolean): Unit = js.native
    def set(
      keyChain: KeyChain,
      value: js.Any,
      getValue: Boolean,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def set(
      keyChain: KeyChain,
      value: js.Any,
      getValue: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    
    def splice(keyChain: KeyChain): Unit = js.native
    def splice(keyChain: KeyChain, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def splice(keyChain: KeyChain, options: SpliceOptions): Unit = js.native
    def splice(
      keyChain: KeyChain,
      options: SpliceOptions,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    
    def unexpire(keys: Keys): Unit = js.native
    def unexpire(keys: Keys, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
  
  @JSImport("sc-broker-cluster", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    def this(options: SCBrokerClusterClientOptions) = this()
    
    def destroy(): Unit = js.native
    def destroy(callback: AsyncResultArrayCallback[SCExchange, Error]): Unit = js.native
    
    def exchange(): SCExchange = js.native
    
    def isSubscribed(channel: String): Boolean = js.native
    def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* packet */ MessagePacket, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[Error], Unit]): this.type = js.native
    
    var options: SCBrokerClusterClientOptions = js.native
    
    def setSCServer(scServer: SCServer): Unit = js.native
    
    def subscribe(channel: String): Unit = js.native
    def subscribe(channel: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def subscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
    def subscribeSocket(socket: ServerSocket, channel: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def unsubscribe(channel: String): Unit = js.native
    def unsubscribe(channel: String, callback: js.Function0[Unit]): Unit = js.native
    
    def unsubscribeAll(): Unit = js.native
    def unsubscribeAll(callback: AsyncResultArrayCallback[js.Any, Error]): Unit = js.native
    
    def unsubscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
    def unsubscribeSocket(socket: ServerSocket, channel: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("sc-broker-cluster", "SCExchange")
  @js.native
  class SCExchange protected () extends AbstractDataClient {
    def this(privateClientCluster: ClientCluster, publicClientCluster: ClientCluster, ioClusterClient: Client) = this()
    
    def channel(channelName: String): SCChannel[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
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
    def send(data: js.Any, mapIndex: String, callback: AsyncResultArrayCallback[js.Any, Error]): Unit = js.native
    def send(data: js.Any, mapIndex: js.Array[String]): Unit = js.native
    def send(data: js.Any, mapIndex: js.Array[String], callback: AsyncResultArrayCallback[js.Any, Error]): Unit = js.native
    def send(data: js.Any, mapIndex: Double): Unit = js.native
    def send(data: js.Any, mapIndex: Double, callback: AsyncResultArrayCallback[js.Any, Error]): Unit = js.native
    def send(data: js.Any, mapIndex: Null, callback: AsyncResultArrayCallback[js.Any, Error]): Unit = js.native
    
    def setMapper(mapper: mapperFunction): Unit = js.native
    
    def subscribe(channelName: String): SCChannel[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
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
  class Server protected () extends EventEmitter {
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
    def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def sendToBroker(brokerId: String, data: js.Any): Unit = js.native
    def sendToBroker(
      brokerId: String,
      data: js.Any,
      callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
    ): Unit = js.native
  }
  
  trait BrokerExitInfo extends StObject {
    
    var code: Double
    
    var id: Double
    
    var pid: Double
    
    var signal: String
  }
  object BrokerExitInfo {
    
    @scala.inline
    def apply(code: Double, id: Double, pid: Double, signal: String): BrokerExitInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerExitInfo]
    }
    
    @scala.inline
    implicit class BrokerExitInfoMutableBuilder[Self <: BrokerExitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type BrokerMessageListener = js.Function3[
    /* brokerId */ String, 
    /* data */ js.Any, 
    /* callback */ js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit], 
    Unit
  ]
  
  trait BrokerStartInfo extends StObject {
    
    var id: Double
    
    var pid: Double
    
    var respawn: Boolean
  }
  object BrokerStartInfo {
    
    @scala.inline
    def apply(id: Double, pid: Double, respawn: Boolean): BrokerStartInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerStartInfo]
    }
    
    @scala.inline
    implicit class BrokerStartInfoMutableBuilder[Self <: BrokerStartInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespawn(value: Boolean): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessagePacket extends StObject {
    
    var channel: String
    
    var data: js.Any
  }
  object MessagePacket {
    
    @scala.inline
    def apply(channel: String, data: js.Any): MessagePacket = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePacket]
    }
    
    @scala.inline
    implicit class MessagePacketMutableBuilder[Self <: MessagePacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait SCBrokerClusterClientOptions extends StObject {
    
    var brokers: js.Array[String]
    
    var connectRetryErrorThreshold: Double
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
  }
  object SCBrokerClusterClientOptions {
    
    @scala.inline
    def apply(brokers: js.Array[String], connectRetryErrorThreshold: Double): SCBrokerClusterClientOptions = {
      val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], connectRetryErrorThreshold = connectRetryErrorThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCBrokerClusterClientOptions]
    }
    
    @scala.inline
    implicit class SCBrokerClusterClientOptionsMutableBuilder[Self <: SCBrokerClusterClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrokers(value: js.Array[String]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokersVarargs(value: String*): Self = StObject.set(x, "brokers", js.Array(value :_*))
      
      @scala.inline
      def setConnectRetryErrorThreshold(value: Double): Self = StObject.set(x, "connectRetryErrorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  trait SCBrokerClusterServerOptions extends StObject {
    
    var appBrokerControllerPath: js.UndefOr[String] = js.undefined
    
    var brokerOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
      ] = js.undefined
    
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
    
    @scala.inline
    def apply(brokers: js.Array[String], downgradeToUser: Double | String): SCBrokerClusterServerOptions = {
      val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCBrokerClusterServerOptions]
    }
    
    @scala.inline
    implicit class SCBrokerClusterServerOptionsMutableBuilder[Self <: SCBrokerClusterServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBrokerControllerPath(value: String): Self = StObject.set(x, "appBrokerControllerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBrokerControllerPathUndefined: Self = StObject.set(x, "appBrokerControllerPath", js.undefined)
      
      @scala.inline
      def setBrokerOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServerOptions */ js.Any
      ): Self = StObject.set(x, "brokerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerOptionsUndefined: Self = StObject.set(x, "brokerOptions", js.undefined)
      
      @scala.inline
      def setBrokers(value: js.Array[String]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokersVarargs(value: String*): Self = StObject.set(x, "brokers", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDowngradeToUser(value: Double | String): Self = StObject.set(x, "downgradeToUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryAccuracy(value: Double): Self = StObject.set(x, "expiryAccuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryAccuracyUndefined: Self = StObject.set(x, "expiryAccuracy", js.undefined)
      
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
      def setProcessTermTimeout(value: Double): Self = StObject.set(x, "processTermTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessTermTimeoutUndefined: Self = StObject.set(x, "processTermTimeout", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  trait SCServer extends StObject {
    
    var codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
  }
  object SCServer {
    
    @scala.inline
    def apply(
      codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
    ): SCServer = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCServer]
    }
    
    @scala.inline
    implicit class SCServerMutableBuilder[Self <: SCServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodec(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CodecEngine */ js.Any
      ): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerSocket extends StObject {
    
    def emit(eventName: String, args: js.Any*): Unit
    
    var id: String
  }
  object ServerSocket {
    
    @scala.inline
    def apply(emit: (String, /* repeated */ js.Any) => Unit, id: String): ServerSocket = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerSocket]
    }
    
    @scala.inline
    implicit class ServerSocketMutableBuilder[Self <: ServerSocket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type handlerFunction = js.Function1[/* data */ js.Any, Unit]
  
  type mapperFunction = js.Function3[
    /* keyChain */ KeyChain, 
    /* method */ String, 
    /* clientIds */ js.Array[Double], 
    Double | js.Array[Double]
  ]
}
