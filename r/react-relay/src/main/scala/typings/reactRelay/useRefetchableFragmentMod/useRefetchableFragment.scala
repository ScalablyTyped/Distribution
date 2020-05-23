package typings.reactRelay.useRefetchableFragmentMod

import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", "useRefetchableFragment")
@js.native
object useRefetchableFragment extends js.Object {
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line:no-unnecessary-generics
  ReturnType[TQuery, TKey, Call[KeyReturnType[TKey]] | Null] = js.native
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): // tslint:disable-next-line:no-unnecessary-generics
  ReturnType[TQuery, TKey, Call[KeyReturnType[TKey]]] = js.native
}

