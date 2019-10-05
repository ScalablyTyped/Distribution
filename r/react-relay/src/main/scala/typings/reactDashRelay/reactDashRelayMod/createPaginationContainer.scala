package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.Anon_RelayRelayPaginationProp
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with Anon_RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}

