package typings.reactRelay.useFragmentMod

import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useFragment", "useFragment")
@js.native
object useFragment extends js.Object {
  def apply[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode): js.Array[Call[ArrayKeyReturnType[TKey]]] | Null = js.native
  def apply[TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): Call[KeyReturnType[TKey]] = js.native
}

