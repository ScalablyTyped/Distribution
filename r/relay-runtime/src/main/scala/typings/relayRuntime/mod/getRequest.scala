package typings.relayRuntime.mod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "getRequest")
@js.native
object getRequest extends js.Object {
  def apply(taggedNode: GraphQLTaggedNode): ConcreteRequest = js.native
}

