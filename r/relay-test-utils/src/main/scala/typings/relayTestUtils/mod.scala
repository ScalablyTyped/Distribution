package typings.relayTestUtils

import typings.react.mod.ComponentType
import typings.reactRelay.mod.RelayPaginationProp
import typings.reactRelay.mod.RelayProp
import typings.reactRelay.mod.RelayRefetchProp
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayTestUtils.anon.HandlerProvider
import typings.relayTestUtils.relayMockPayloadGeneratorMod.MockResolvers
import typings.relayTestUtils.relayModernMockEnvironmentMod.RelayMockEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("relay-test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object MockPayloadGenerator {
    
    @JSImport("relay-test-utils", "MockPayloadGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(operation: OperationDescriptor): GraphQLResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any]).asInstanceOf[GraphQLResponse]
    inline def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(operation.asInstanceOf[js.Any], mockResolvers.asInstanceOf[js.Any])).asInstanceOf[GraphQLResponse]
  }
  
  inline def createMockEnvironment(): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")().asInstanceOf[RelayMockEnvironment]
  inline def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockEnvironment")(config.asInstanceOf[js.Any]).asInstanceOf[RelayMockEnvironment]
  
  inline def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapContainer")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
