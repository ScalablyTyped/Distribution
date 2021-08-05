package typings.relayRuntime.anon

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var operation: OperationDescriptor
  
  var source: RelayObservable[GraphQLResponse]
}
object Source {
  
  inline def apply(operation: OperationDescriptor, source: RelayObservable[GraphQLResponse]): Source = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setSource(value: RelayObservable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
