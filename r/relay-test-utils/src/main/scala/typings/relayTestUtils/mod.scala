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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMockEnvironment(): RelayMockEnvironment = js.native
  def createMockEnvironment(config: HandlerProvider): RelayMockEnvironment = js.native
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
  @js.native
  object MockPayloadGenerator extends js.Object {
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
}

