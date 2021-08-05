package typings.sccBrokerClient

import typings.agSimpleBroker.mod.PublishData
import typings.agSimpleBroker.mod.SubscribeData
import typings.agSimpleBroker.mod.UnsubscribeData
import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.sccBrokerClientStrings.publish
import typings.sccBrokerClient.sccBrokerClientStrings.simple
import typings.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typings.sccBrokerClient.sccBrokerClientStrings.subscribe
import typings.sccBrokerClient.sccBrokerClientStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scc-broker-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(broker: Broker, options: SCCBrokerClientOptions): typings.sccBrokerClient.clusterBrokerClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(broker.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sccBrokerClient.clusterBrokerClientMod.^]
  
  @js.native
  trait Broker extends StObject {
    
    def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    @JSName("listener")
    def listener_publish(eventName: publish): typings.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def subscriptions(): js.Array[String] = js.native
  }
  
  trait MappingEngine extends StObject {
    
    def findSite(key: String): String
    
    def getSites(): js.Array[String]
    
    def setSites(sites: js.Array[String]): Unit
  }
  object MappingEngine {
    
    inline def apply(findSite: String => String, getSites: () => js.Array[String], setSites: js.Array[String] => Unit): MappingEngine = {
      val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
      __obj.asInstanceOf[MappingEngine]
    }
    
    extension [Self <: MappingEngine](x: Self) {
      
      inline def setFindSite(value: String => String): Self = StObject.set(x, "findSite", js.Any.fromFunction1(value))
      
      inline def setGetSites(value: () => js.Array[String]): Self = StObject.set(x, "getSites", js.Any.fromFunction0(value))
      
      inline def setSetSites(value: js.Array[String] => Unit): Self = StObject.set(x, "setSites", js.Any.fromFunction1(value))
    }
  }
  
  trait SCCBrokerClientOptions extends StObject {
    
    var authKey: js.UndefOr[Secret] = js.undefined
    
    var brokerRetryDelay: js.UndefOr[Double] = js.undefined
    
    var clientPoolSize: js.UndefOr[Double] = js.undefined
    
    var instanceId: js.UndefOr[String] = js.undefined
    
    var instanceIp: js.UndefOr[String] = js.undefined
    
    var instanceIpFamily: js.UndefOr[String] = js.undefined
    
    var instancePort: js.UndefOr[Double] = js.undefined
    
    var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.undefined
    
    var noErrorLogging: js.UndefOr[Boolean] = js.undefined
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
    
    var stateServerAckTimeout: js.UndefOr[Double] = js.undefined
    
    var stateServerConnectTimeout: js.UndefOr[Double] = js.undefined
    
    var stateServerHost: String
    
    var stateServerPort: js.UndefOr[Double] = js.undefined
    
    var stateServerReconnectRandomness: js.UndefOr[Double] = js.undefined
  }
  object SCCBrokerClientOptions {
    
    inline def apply(stateServerHost: String): SCCBrokerClientOptions = {
      val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCCBrokerClientOptions]
    }
    
    extension [Self <: SCCBrokerClientOptions](x: Self) {
      
      inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      inline def setBrokerRetryDelay(value: Double): Self = StObject.set(x, "brokerRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setBrokerRetryDelayUndefined: Self = StObject.set(x, "brokerRetryDelay", js.undefined)
      
      inline def setClientPoolSize(value: Double): Self = StObject.set(x, "clientPoolSize", value.asInstanceOf[js.Any])
      
      inline def setClientPoolSizeUndefined: Self = StObject.set(x, "clientPoolSize", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setInstanceIp(value: String): Self = StObject.set(x, "instanceIp", value.asInstanceOf[js.Any])
      
      inline def setInstanceIpFamily(value: String): Self = StObject.set(x, "instanceIpFamily", value.asInstanceOf[js.Any])
      
      inline def setInstanceIpFamilyUndefined: Self = StObject.set(x, "instanceIpFamily", js.undefined)
      
      inline def setInstanceIpUndefined: Self = StObject.set(x, "instanceIp", js.undefined)
      
      inline def setInstancePort(value: Double): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
      
      inline def setMappingEngine(value: skeletonRendezvous | simple | MappingEngine): Self = StObject.set(x, "mappingEngine", value.asInstanceOf[js.Any])
      
      inline def setMappingEngineUndefined: Self = StObject.set(x, "mappingEngine", js.undefined)
      
      inline def setNoErrorLogging(value: Boolean): Self = StObject.set(x, "noErrorLogging", value.asInstanceOf[js.Any])
      
      inline def setNoErrorLoggingUndefined: Self = StObject.set(x, "noErrorLogging", js.undefined)
      
      inline def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      inline def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      inline def setStateServerAckTimeout(value: Double): Self = StObject.set(x, "stateServerAckTimeout", value.asInstanceOf[js.Any])
      
      inline def setStateServerAckTimeoutUndefined: Self = StObject.set(x, "stateServerAckTimeout", js.undefined)
      
      inline def setStateServerConnectTimeout(value: Double): Self = StObject.set(x, "stateServerConnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setStateServerConnectTimeoutUndefined: Self = StObject.set(x, "stateServerConnectTimeout", js.undefined)
      
      inline def setStateServerHost(value: String): Self = StObject.set(x, "stateServerHost", value.asInstanceOf[js.Any])
      
      inline def setStateServerPort(value: Double): Self = StObject.set(x, "stateServerPort", value.asInstanceOf[js.Any])
      
      inline def setStateServerPortUndefined: Self = StObject.set(x, "stateServerPort", js.undefined)
      
      inline def setStateServerReconnectRandomness(value: Double): Self = StObject.set(x, "stateServerReconnectRandomness", value.asInstanceOf[js.Any])
      
      inline def setStateServerReconnectRandomnessUndefined: Self = StObject.set(x, "stateServerReconnectRandomness", js.undefined)
    }
  }
}
