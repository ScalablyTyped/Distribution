package typings.reactRelay

import typings.reactRelay.useRefetchableFragmentNodeMod.Options
import typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useRefetchableFragment", JSImport.Namespace)
@js.native
object useRefetchableFragmentMod extends js.Object {
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: AnonData */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnType[TQuery, TKey] = js.native
  type Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type NonNullableReturnType[T /* <: AnonDataUnknown */] = js.Function1[
    /* arg */ T, 
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any
    ]
  ]
  type NullableReturnType[T /* <: AnonData */] = js.Function1[
    /* arg */ T, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[' $data'] */ js.Any) | Null
  ]
  type ReturnType[TQuery /* <: OperationType */, TKey /* <: AnonData */] = js.Tuple2[
    Call[NonNullableReturnType[TKey] with NullableReturnType[TKey]], 
    RefetchFnDynamic[TQuery, TKey, Options]
  ]
}

