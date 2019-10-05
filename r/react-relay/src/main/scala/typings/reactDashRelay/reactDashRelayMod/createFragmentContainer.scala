package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.Anon_Relay
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  def apply[Props](Component: ComponentType[Props with Anon_Relay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = js.native
}

