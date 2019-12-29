package typings.relayDashRuntime

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.relayDashRuntimeMod.FragmentRef
import typings.relayDashRuntime.relayDashRuntimeMod._RefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/readInlineData", JSImport.Namespace)
@js.native
object libStoreReadInlineDataMod extends js.Object {
  def readInlineData[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode): js.UndefOr[T | Null] = js.native
  def readInlineData[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): js.UndefOr[T | Null] = js.native
  @JSName("readInlineData")
  def readInlineData_T__RefTypeWildcard_T[T /* <: _RefType[_] */](fragment: GraphQLTaggedNode, ref: FragmentRef[T]): T = js.native
}

