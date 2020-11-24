package typings.reactRelay.mod

import typings.react.mod.ComponentType
import typings.reactRelay.anon.Relay
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay", "createFragmentContainer")
@js.native
object createFragmentContainer extends js.Object {
  
  def apply[Props](Component: ComponentType[Props with Relay], fragmentSpec: Record[String, GraphQLTaggedNode]): Container[Props] = js.native
}
