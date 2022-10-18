package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.start',   executeId :number,   params :relay-runtime.relay-runtime/lib/util/RelayConcreteNode.RequestParameters,   variables :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.Variables,   cacheConfig :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.CacheConfig}> */
trait Readonlynameexecutestarte
  extends StObject
     with LogEvent {
  
  val cacheConfig: CacheConfig
  
  val executeId: Double
  
  val name: executeDotstart
  
  val params: RequestParameters
  
  val variables: Variables
}
object Readonlynameexecutestarte {
  
  inline def apply(cacheConfig: CacheConfig, executeId: Double, params: RequestParameters, variables: Variables): Readonlynameexecutestarte = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.start", params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynameexecutestarte]
  }
  
  extension [Self <: Readonlynameexecutestarte](x: Self) {
    
    inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDotstart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
