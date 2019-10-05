package typings.relayDashTestDashUtils

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.reactDashRelayMod.RelayPaginationProp
import typings.reactDashRelay.reactDashRelayMod.RelayProp
import typings.reactDashRelay.reactDashRelayMod.RelayRefetchProp
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashTestDashUtils.libRelayMockPayloadGeneratorMod.MockResolvers
import typings.relayDashTestDashUtils.libRelayModernMockEnvironmentMod.RelayMockEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils", JSImport.Namespace)
@js.native
object relayDashTestDashUtilsMod extends js.Object {
  def createMockEnvironment(): RelayMockEnvironment = js.native
  def createMockEnvironment(config: Anon_HandlerProvider): RelayMockEnvironment = js.native
  def unwrapContainer[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = js.native
  @js.native
  object MockEnvironment extends js.Object {
    def createMockEnvironment(): RelayMockEnvironment = js.native
    def createMockEnvironment(config: Anon_HandlerProvider): RelayMockEnvironment = js.native
  }
  
  @js.native
  object MockPayloadGenerator extends js.Object {
    def generate(operation: OperationDescriptor): GraphQLResponse = js.native
    def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
  }
  
}

