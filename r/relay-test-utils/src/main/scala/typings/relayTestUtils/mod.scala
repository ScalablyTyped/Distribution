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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MockPayloadGenerator {
    
    @JSImport("relay-test-utils", "MockPayloadGenerator.generate")
    @js.native
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    @JSImport("relay-test-utils", "MockPayloadGenerator.generate")
    @js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
  @JSImport("relay-test-utils", "createMockEnvironment")
  @js.native
  def createMockEnvironment(): RelayMockEnvironment = js.native
  @JSImport("relay-test-utils", "createMockEnvironment")
  @js.native
  def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = js.native
  
  @JSImport("relay-test-utils", "unwrapContainer")
  @js.native
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
}
