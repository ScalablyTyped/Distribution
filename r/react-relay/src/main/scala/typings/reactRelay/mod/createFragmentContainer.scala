package typings.reactRelay.mod

import typings.react.mod.ComponentType
import typings.reactRelay.AnonRelay
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  def apply[Props](Component: ComponentType[Props with AnonRelay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = js.native
}

