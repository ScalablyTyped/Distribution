package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRelayDashExperimentalUseRefetchableFragmentNodeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Disposable
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
  import typings.std.ReturnType

  type RefetchExact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any | Null], RefetchFnExact[TQuery, TOptions]]
  type RefetchExactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchExact[TQuery, TOptions]]
  type RefetchFn[TQuery /* <: OperationType */, TOptions] = RefetchFnExact[TQuery, TOptions]
  type RefetchFnBase[TVars, TOptions] = js.Function2[/* vars */ TVars, /* options */ js.UndefOr[TOptions], Disposable]
  type RefetchFnDynamic[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] = (RefetchInexactDynamicResponse[TQuery, TOptions]) with (RefetchExactDynamicResponse[TQuery, TOptions])
  type RefetchFnExact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[
    /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchFnInexact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[
    /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchInexact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any], RefetchFnInexact[TQuery, TOptions]]
  type RefetchInexactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchInexact[TQuery, TOptions]]
}
