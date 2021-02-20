package typings.relayTestUtils

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdate
import typings.relayTestUtils.anon.HandlerProvider
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayModernMockEnvironmentMod {
  
  @JSImport("relay-test-utils/lib/RelayModernMockEnvironment", "createMockEnvironment")
  @js.native
  def createMockEnvironment(): RelayMockEnvironment = js.native
  @JSImport("relay-test-utils/lib/RelayModernMockEnvironment", "createMockEnvironment")
  @js.native
  def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = js.native
  
  @js.native
  trait MockEnvironment extends StObject {
    
    var mock: MockFunctions = js.native
    
    def mockClear(): Unit = js.native
  }
  object MockEnvironment {
    
    @scala.inline
    def apply(mock: MockFunctions, mockClear: () => Unit): MockEnvironment = {
      val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear))
      __obj.asInstanceOf[MockEnvironment]
    }
    
    @scala.inline
    implicit class MockEnvironmentMutableBuilder[Self <: MockEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMock(value: MockFunctions): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockClear(value: () => Unit): Self = StObject.set(x, "mockClear", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MockFunctions extends StObject {
    
    def cachePayload(request: ConcreteRequest, variables: Variables, payload: GraphQLResponse): Unit = js.native
    def cachePayload(request: OperationDescriptor, variables: Variables, payload: GraphQLResponse): Unit = js.native
    
    def clearCache(): Unit = js.native
    
    def complete(request: ConcreteRequest): Unit = js.native
    def complete(request: OperationDescriptor): Unit = js.native
    
    def findOperation(findFn: js.Function1[/* operation */ OperationDescriptor, Boolean]): OperationDescriptor = js.native
    
    def getAllOperations(): js.Array[OperationDescriptor] = js.native
    
    def getMostRecentOperation(): OperationDescriptor = js.native
    
    def isLoading(request: ConcreteRequest, variables: Variables): Boolean = js.native
    def isLoading(request: ConcreteRequest, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
    def isLoading(request: OperationDescriptor, variables: Variables): Boolean = js.native
    def isLoading(request: OperationDescriptor, variables: Variables, cacheConfig: CacheConfig): Boolean = js.native
    
    def nextValue(request: ConcreteRequest, payload: GraphQLResponse): Unit = js.native
    def nextValue(request: OperationDescriptor, payload: GraphQLResponse): Unit = js.native
    
    def queueOperationResolver(resolver: OperationMockResolver): Unit = js.native
    
    def reject(request: ConcreteRequest, error: String): Unit = js.native
    def reject(request: ConcreteRequest, error: Error): Unit = js.native
    def reject(request: OperationDescriptor, error: String): Unit = js.native
    def reject(request: OperationDescriptor, error: Error): Unit = js.native
    
    def rejectMostRecentOperation(error: js.Function1[/* operation */ OperationDescriptor, Error]): Unit = js.native
    def rejectMostRecentOperation(error: Error): Unit = js.native
    
    def resolve(request: ConcreteRequest, payload: GraphQLResponse): Unit = js.native
    def resolve(request: OperationDescriptor, payload: GraphQLResponse): Unit = js.native
    
    def resolveMostRecentOperation(payload: js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | Unit]): Unit = js.native
    def resolveMostRecentOperation(payload: GraphQLResponse): Unit = js.native
  }
  
  type OperationMockResolver = js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | Error | Null]
  
  @js.native
  trait RelayMockEnvironment
    extends MockEnvironment
       with Environment {
    
    var configName: js.UndefOr[String | Null] = js.native
    
    def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit = js.native
    
    def revertUpdate(update: OptimisticUpdate): Unit = js.native
  }
}
