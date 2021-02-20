package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.getRequestIdentifierMod.RequestIdentifier
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDescriptor extends StObject {
  
  val cacheConfig: CacheConfig | Null = js.native
  
  val identifier: RequestIdentifier = js.native
  
  val node: ConcreteRequest = js.native
  
  val variables: Variables = js.native
}
object RequestDescriptor {
  
  @scala.inline
  def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDescriptor]
  }
  
  @scala.inline
  implicit class RequestDescriptorMutableBuilder[Self <: RequestDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    @scala.inline
    def setIdentifier(value: RequestIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ConcreteRequest): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
