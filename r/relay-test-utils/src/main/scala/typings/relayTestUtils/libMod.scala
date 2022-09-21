package typings.relayTestUtils

import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.relayRuntime.relayNetworkTypesMod.GraphQLSingularResponse
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayTestUtils.anon.MockClientData
import typings.relayTestUtils.anon.PartialEnvironmentConfig
import typings.relayTestUtils.relayMockPayloadGeneratorMod.MockResolvers
import typings.relayTestUtils.relayModernMockEnvironmentMod.RelayMockEnvironment
import typings.relayTestUtils.relayTestUtilsStrings.Space$fragmentSpreads
import typings.relayTestUtils.relayTestUtilsStrings.Space$fragmentType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("relay-test-utils/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object MockPayloadGenerator {
    
    @JSImport("relay-test-utils/lib", "MockPayloadGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(operation: OperationDescriptor): GraphQLSingularResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any]).asInstanceOf[GraphQLSingularResponse]
    inline def generate(operation: OperationDescriptor, mockResolvers: Null, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
    inline def generate(operation: OperationDescriptor, mockResolvers: Unit, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
    inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
    inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers, options: MockClientData): GraphQLSingularResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GraphQLSingularResponse]
  }
  
  inline def createMockEnvironment(): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")().asInstanceOf[RelayMockEnvironment]
  inline def createMockEnvironment(config: PartialEnvironmentConfig): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")(config.asInstanceOf[js.Any]).asInstanceOf[RelayMockEnvironment]
  
  inline def testResolver[TKey /* <: KeyType[Any] */, Ret](
    resolver: js.Function1[/* arg */ TKey, Ret],
    fragmentData: Omit[KeyTypeData[TKey, Any], Space$fragmentSpreads | Space$fragmentType]
  ): Ret = (^.asInstanceOf[js.Dynamic].applyDynamic("testResolver")(resolver.asInstanceOf[js.Any], fragmentData.asInstanceOf[js.Any])).asInstanceOf[Ret]
}
