package typings.sccBrokerClient

import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.anon.Error
import typings.sccBrokerClient.sccBrokerClientBooleans.`true`
import typings.sccBrokerClient.sccBrokerClientStrings.error
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.publishFail
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typings.socketclusterClient.libClientsocketMod.SubscribeOptions
import typings.socketclusterClient.mod.AGClientSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientPoolMod {
  
  @JSImport("scc-broker-client/client-pool", JSImport.Namespace)
  @js.native
  open class ^ () extends ClientPool {
    def this(options: ClientPoolOptions) = this()
  }
  
  trait BrokenDownURI extends StObject {
    
    var hostname: String
    
    var port: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[`true`] = js.undefined
  }
  object BrokenDownURI {
    
    inline def apply(hostname: String): BrokenDownURI = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokenDownURI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrokenDownURI] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSecure(value: `true`): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait ClientPool
    extends typings.asyncStreamEmitter.mod.^[Any] {
    
    var authKey: js.UndefOr[Secret] = js.native
    
    def breakDownURI(uri: String): BrokenDownURI = js.native
    
    var clientCount: Double = js.native
    
    var clients: js.Array[AGClientSocket] = js.native
    
    def closeChannel(channelName: String): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_error(eventName: error, data: Error): Unit = js.native
    @JSName("emit")
    def emit_publish(eventName: publish, data: PublishData): Unit = js.native
    @JSName("emit")
    def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
    
    var hasher: typings.sccBrokerClient.hasherMod.^ = js.native
    
    def invokePublish(channelName: String, data: Any): js.Promise[Unit] = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typings.consumableStream.mod.^[Error] = js.native
    @JSName("listener")
    def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_publishFail(eventName: publishFail): typings.consumableStream.mod.^[PublishFailData] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_subscribeFail(eventName: subscribeFail): typings.consumableStream.mod.^[SubscribeFailData] = js.native
    
    def selectClient(key: String): AGClientSocket = js.native
    
    def subscribe(channelName: String): typings.agChannel.mod.^[Any] = js.native
    def subscribe(channelName: String, options: SubscribeOptions): typings.agChannel.mod.^[Any] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    var targetURI: String = js.native
    
    def unsubscribe(channelName: String): js.Promise[Unit] = js.native
  }
  
  trait ClientPoolOptions extends StObject {
    
    var authKey: js.UndefOr[Secret] = js.undefined
    
    var clientCount: js.UndefOr[Double] = js.undefined
    
    var targetURI: String
  }
  object ClientPoolOptions {
    
    inline def apply(targetURI: String): ClientPoolOptions = {
      val __obj = js.Dynamic.literal(targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientPoolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientPoolOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      inline def setClientCount(value: Double): Self = StObject.set(x, "clientCount", value.asInstanceOf[js.Any])
      
      inline def setClientCountUndefined: Self = StObject.set(x, "clientCount", js.undefined)
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishData extends StObject {
    
    var channel: String
    
    var data: Any
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object PublishData {
    
    inline def apply(channel: String, data: Any, poolIndex: Double, targetURI: String): PublishData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublishData] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishFailData extends StObject {
    
    var channel: String
    
    var error: js.Error
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object PublishFailData {
    
    inline def apply(channel: String, error: js.Error, poolIndex: Double, targetURI: String): PublishFailData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishFailData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublishFailData] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeData extends StObject {
    
    var channel: String
    
    var poolIndex: Double
    
    var targetURI: String
  }
  object SubscribeData {
    
    inline def apply(channel: String, poolIndex: Double, targetURI: String): SubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscribeData] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setPoolIndex(value: Double): Self = StObject.set(x, "poolIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetURI(value: String): Self = StObject.set(x, "targetURI", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscribeFailData
    extends StObject
       with SubscribeData {
    
    var error: js.Error
  }
  object SubscribeFailData {
    
    inline def apply(channel: String, error: js.Error, poolIndex: Double, targetURI: String): SubscribeFailData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeFailData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscribeFailData] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
