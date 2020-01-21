package typings.reactRelay.mod

import typings.react.mod.ComponentType
import typings.reactRelay.AnonRelayRelayRefetchProp
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createRefetchContainer")
@js.native
object createRefetchContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with AnonRelayRelayRefetchProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    refetchQuery: GraphQLTaggedNode
  ): Container[Props] = js.native
}

