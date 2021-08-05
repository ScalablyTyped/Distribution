package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.getRequestIdentifierMod.RequestIdentifier
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDescriptor extends StObject {
  
  val cacheConfig: CacheConfig | Null
  
  val identifier: RequestIdentifier
  
  val node: ConcreteRequest
  
  val variables: Variables
}
object RequestDescriptor {
  
  inline def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], cacheConfig = null)
    __obj.asInstanceOf[RequestDescriptor]
  }
  
  extension [Self <: RequestDescriptor](x: Self) {
    
    inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    inline def setIdentifier(value: RequestIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setNode(value: ConcreteRequest): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
