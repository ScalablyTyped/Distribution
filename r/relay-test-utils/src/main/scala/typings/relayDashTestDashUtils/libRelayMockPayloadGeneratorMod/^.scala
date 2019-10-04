package typings.relayDashTestDashUtils.libRelayMockPayloadGeneratorMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-test-utils/lib/RelayMockPayloadGenerator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(operation: OperationDescriptor): GraphQLResponse = js.native
  def generate(operation: OperationDescriptor, mockResolvers: MockResolvers): GraphQLResponse = js.native
}

