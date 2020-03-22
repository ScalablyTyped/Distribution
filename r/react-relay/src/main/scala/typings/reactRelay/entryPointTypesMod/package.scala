package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object entryPointTypesMod {
  type EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = typings.react.mod.Component[
    typings.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps], 
    js.Object, 
    js.Any
  ]
  type EnvironmentProviderOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractEntryPointTypeHelper[TEntryPointParams] = js.Function1[
    /* entryPoint */ js.UndefOr[typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint[js.Any] | scala.Null], 
    js.UndefOr[
      (typings.reactRelay.entryPointTypesMod.ThinNestedEntryPointParams[
        TEntryPointParams, 
        typings.reactRelay.entryPointTypesMod.EntryPoint[TEntryPointParams, js.Any]
      ]) | scala.Null
    ]
  ]
  type ExtractQueryTypeHelper[TEnvironmentProviderOptions] = js.Function1[
    /* query */ typings.reactRelay.entryPointTypesMod.PreloadedQuery[
      typings.relayRuntime.relayRuntimeTypesMod.OperationType, 
      typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
    ], 
    typings.reactRelay.entryPointTypesMod.ThinQueryParams[
      typings.relayRuntime.relayRuntimeTypesMod.OperationType, 
      TEnvironmentProviderOptions
    ]
  ]
  type PreloadableConcreteRequest[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Object
}
