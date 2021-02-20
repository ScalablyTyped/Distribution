package typings.relayRuntime

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernOperationDescriptorMod {
  
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(
    request: ConcreteRequest,
    variables: Variables,
    cacheConfig: js.UndefOr[scala.Nothing],
    dataID: DataID
  ): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: Null, dataID: DataID): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): OperationDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createOperationDescriptor")
  @js.native
  def createOperationDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig, dataID: DataID): OperationDescriptor = js.native
  
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables): RequestDescriptor = js.native
  @JSImport("relay-runtime/lib/store/RelayModernOperationDescriptor", "createRequestDescriptor")
  @js.native
  def createRequestDescriptor(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): RequestDescriptor = js.native
}
