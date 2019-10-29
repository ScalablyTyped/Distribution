package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.$Call
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.NonNullableArrayReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.NonNullableReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.NullableArrayReturnType
import typings.reactDashRelay.libRelayDashExperimentalUseFragmentMod.NullableReturnType
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useFragment", JSImport.Namespace)
@js.native
object libRelayDashExperimentalUseFragmentMod extends js.Object {
  def useFragment[TKey /* <: js.Array[Anon_DataUnknown] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): $Call[NonNullableArrayReturnType[TKey]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_Anon_Data[TKey /* <: Anon_Data */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): $Call[NullableReturnType[TKey]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_Anon_DataUnknown[TKey /* <: Anon_DataUnknown */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): $Call[NonNullableReturnType[TKey]] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayAnon_Data[TKey /* <: js.Array[Anon_Data] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): $Call[NullableArrayReturnType[TKey]] = js.native
  // NOTE: These declares ensure that the type of the returned data is:
  //   - non-nullable if the provided ref type is non-nullable
  //   - nullable if the provided ref type is nullable
  //   - array of non-nullable if the privoided ref type is an array of
  //     non-nullable refs
  //   - array of nullable if the privoided ref type is an array of nullable refs
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type NonNullableArrayReturnType[T /* <: js.Array[Anon_DataUnknown] */] = js.Function1[
    /* arg */ Anon_DataT[T], 
    js.Array[
      NonNullable[
        /* import warning: ImportType.apply Failed type conversion: T[0][' $data'] */ js.Any
      ]
    ]
  ]
  type NonNullableReturnType[T /* <: Anon_DataUnknown */] = js.Function1[
    /* arg */ T, 
    NonNullable[
      /* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type NullableArrayReturnType[T /* <: js.Array[Anon_Data] */] = js.Function1[
    /* arg */ T, 
    (js.Array[
      /* import warning: ImportType.apply Failed type conversion: T[0][' $data'] */ js.Any
    ]) | Null
  ]
  type NullableReturnType[T /* <: Anon_Data */] = js.Function1[
    /* arg */ T, 
    (/* import warning: ImportType.apply Failed type conversion: T[' $data'] */ js.Any) | Null
  ]
}

