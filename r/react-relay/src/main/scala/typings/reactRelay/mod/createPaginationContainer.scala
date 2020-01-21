package typings.reactRelay.mod

import typings.react.mod.ComponentType
import typings.reactRelay.AnonRelayRelayPaginationProp
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  def apply[Props](
    Component: ComponentType[Props with AnonRelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}

