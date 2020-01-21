package typings.relayRuntime.mod

import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "readInlineData")
@js.native
object readInlineData extends js.Object {
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def apply[T /* <: RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
}

