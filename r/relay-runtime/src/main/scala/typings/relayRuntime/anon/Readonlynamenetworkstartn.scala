package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.relayRuntimeStrings.networkDotstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'network.start',   networkRequestId :number,   params :relay-runtime.relay-runtime/lib/util/RelayConcreteNode.RequestParameters,   variables :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.Variables,   cacheConfig :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.CacheConfig}> */
trait Readonlynamenetworkstartn
  extends StObject
     with LogEvent {
  
  val cacheConfig: CacheConfig
  
  val name: networkDotstart
  
  val networkRequestId: Double
  
  val params: RequestParameters
  
  val variables: Variables
}
object Readonlynamenetworkstartn {
  
  inline def apply(
    cacheConfig: CacheConfig,
    networkRequestId: Double,
    params: RequestParameters,
    variables: Variables
  ): Readonlynamenetworkstartn = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], name = "network.start", networkRequestId = networkRequestId.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamenetworkstartn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlynamenetworkstartn] (val x: Self) extends AnyVal {
    
    inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setName(value: networkDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestId(value: Double): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
    
    inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
