package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useRefetchableFragmentNodeMod {
  
  type RefetchExact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any | scala.Null], 
    typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  ]
  
  type RefetchExactDynamicResponse[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.std.ReturnType[typings.reactRelay.useRefetchableFragmentNodeMod.RefetchExact[TQuery, TOptions]]
  
  type RefetchFn[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  
  type RefetchFnBase[TVars, TOptions] = js.Function2[
    /* vars */ TVars, 
    /* options */ js.UndefOr[TOptions], 
    typings.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  
  type RefetchFnDynamic[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey /* <: typings.reactRelay.helpersMod.KeyType[_] | scala.Null */, TOptions] = (typings.reactRelay.useRefetchableFragmentNodeMod.RefetchInexactDynamicResponse[TQuery, TOptions]) with (typings.reactRelay.useRefetchableFragmentNodeMod.RefetchExactDynamicResponse[TQuery, TOptions])
  
  type RefetchFnExact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[typings.relayRuntime.relayRuntimeTypesMod.VariablesOf[TQuery], TOptions]
  
  type RefetchFnInexact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnBase[
    typings.std.Partial[typings.relayRuntime.relayRuntimeTypesMod.VariablesOf[TQuery]], 
    TOptions
  ]
  
  type RefetchInexact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnInexact[TQuery, TOptions]
  ]
  
  type RefetchInexactDynamicResponse[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.std.ReturnType[
    typings.reactRelay.useRefetchableFragmentNodeMod.RefetchInexact[TQuery, TOptions]
  ]
}
