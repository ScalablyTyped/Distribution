package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "readInlineData")
@js.native
object readInlineData extends js.Object {
  def apply[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def apply[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
}

