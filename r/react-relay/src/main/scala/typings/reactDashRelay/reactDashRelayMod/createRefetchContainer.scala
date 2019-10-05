package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.Anon_RelayRelayRefetchProp
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createRefetchContainer")
@js.native
object createRefetchContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with Anon_RelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
}

