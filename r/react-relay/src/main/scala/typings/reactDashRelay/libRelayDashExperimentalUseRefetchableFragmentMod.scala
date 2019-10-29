package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.$Call
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.NonNullableReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.NullableReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentMod.ReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod.Options
import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", JSImport.Namespace)
@js.native
object libRelayDashExperimentalUseRefetchableFragmentMod extends js.Object {
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnType[TQuery, TKey] = js.native
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type NonNullableReturnType[T /* <: Anon_DataUnknown */] = js.Function1[
    /* arg */ T, 
    NonNullable[
      /* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type NullableReturnType[T /* <: Anon_Data */] = js.Function1[
    /* arg */ T, 
    (/* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any) | Null
  ]
  type ReturnType[TQuery /* <: OperationType */, TKey /* <: Anon_Data */] = js.Tuple2[
    $Call[NonNullableReturnType[TKey] with NullableReturnType[TKey]], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}

