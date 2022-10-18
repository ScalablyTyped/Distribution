package typings.relayRuntime

import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayModernOperationDescriptorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Unit, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  inline def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperationDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any], dataID.asInstanceOf[js.Any])).asInstanceOf[OperationDescriptor]
  
  inline def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequestDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[RequestDescriptor]
  inline def createRequestDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): RequestDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("createRequestDescriptor")(request.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], cacheConfig.asInstanceOf[js.Any])).asInstanceOf[RequestDescriptor]
}
