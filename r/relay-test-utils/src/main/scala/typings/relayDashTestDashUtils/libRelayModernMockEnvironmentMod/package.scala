package typings.relayDashTestDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayModernMockEnvironmentMod {
  import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
  import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
  import typings.std.Error

  type OperationMockResolver = js.Function1[/* operation */ OperationDescriptor, GraphQLResponse | Error | Null]
}
