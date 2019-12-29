package typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useFragment", "useFragment")
@js.native
object useFragment extends js.Object {
  def apply[TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): $Call[KeyReturnType[TKey]] | Null = js.native
  def apply[TKey /* <: ArrayKeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): js.Array[$Call[ArrayKeyReturnType[TKey]]] = js.native
}

