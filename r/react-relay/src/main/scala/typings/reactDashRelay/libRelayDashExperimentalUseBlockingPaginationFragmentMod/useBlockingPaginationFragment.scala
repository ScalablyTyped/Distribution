package typings.reactDashRelay.libRelayDashExperimentalUseBlockingPaginationFragmentMod

import typings.reactDashRelay.Anon_Data
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", "useBlockingPaginationFragment")
@js.native
object useBlockingPaginationFragment extends js.Object {
  def apply[TQuery /* <: OperationType */, TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): ReturnType[
    // tslint:disable-next-line:no-unnecessary-generics
  TQuery, 
    TKey, 
    // NOTE: This $Call ensures that the type of the returned data is either:
  //   - nullable if the provided ref type is nullable
  //   - non-nullable if the provided ref type is non-nullable
  // prettier-ignore
  $Call[NonNullableReturnType[TKey] with NullableReturnType[TKey]]
  ] = js.native
  def apply[TQuery /* <: OperationType */, TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): ReturnType[
    // tslint:disable-next-line:no-unnecessary-generics
  TQuery, 
    TKey, 
    // NOTE: This $Call ensures that the type of the returned data is either:
  //   - nullable if the provided ref type is nullable
  //   - non-nullable if the provided ref type is non-nullable
  // prettier-ignore
  $Call[NonNullableReturnType[TKey] with NullableReturnType[TKey]]
  ] = js.native
}

